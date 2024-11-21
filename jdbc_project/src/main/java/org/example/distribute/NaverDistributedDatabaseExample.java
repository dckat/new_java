package org.example.distribute;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.*;
import java.util.Arrays;

public class NaverDistributedDatabaseExample {
    // MySQL JDBC URL
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/naver";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";

    // MongoDB Connection URI
    private static final String MONGO_URI = "mongodb://localhost:27017";

    public static void main(String[] args) {
        try {
            // 1. mysql 연결
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection mysqlConnection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
            System.out.println("Connected to MySQL");

            // 2. 회원가입 후 자동증가한 id 얻어오기
            String insertUserSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = mysqlConnection.prepareStatement(insertUserSQL, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, "John Doe");
            pstmt.setString(2, "john.doe@example.com");
            pstmt.executeUpdate();
            System.out.println("2. sql 전송");

            // 3. 2번에서 얻은 id를 이용해서 몽고db에 주문정보 넣기
            ResultSet rs = pstmt.getGeneratedKeys();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt(1);
            }
            System.out.println("자동생성된 userId>> " + userId);
            //    3-1. mongodb에 연결
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            MongoDatabase mongoDatabase = mongoClient.getDatabase("naver2");
            MongoCollection<Document> ordersCollection = mongoDatabase.getCollection("orders");
            System.out.println("3. mongoDB 연결");

            //    3-2. document를 만들어서 전송
            Document order = new Document("user_id", userId)
                    .append("order_date", "2024-11-20")
                    .append("items", Arrays.asList(
                            new Document("product", "item1").append("quantity", 2),
                            new Document("product", "item2").append("quantity", 1)
                    ));
            ordersCollection.insertOne(order);
            System.out.println("Inserted order for user ID: " + userId);
            System.out.println("4. Send to MongoDB");

            // 4. 회원정보는 mysql 검색, 회원주문정보보기는 mongodb 검색하여 분산
            String selectUserSQL = "SELECT * FROM users WHERE id = ?";
            PreparedStatement selectPstmt = mysqlConnection.prepareStatement(selectUserSQL);
            selectPstmt.setInt(1, userId);
            ResultSet userResult = selectPstmt.executeQuery();
            if (userResult.next()) {
                System.out.println("User Info: ");
                System.out.println("ID: " + userResult.getInt("id"));
                System.out.println("Name: " + userResult.getString("name"));
                System.out.println("Email: " + userResult.getString("email"));
            }

            // 4-2. 회원주문정보보기는 mongodb 검색
            Document filter = new Document("user_id", userId);
            Document result = ordersCollection.find(filter).first();
            if (result != null) {
                System.out.println("몽고db 검색결과>> " + result.toJson());
            }

            mysqlConnection.close();
            mongoClient.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
