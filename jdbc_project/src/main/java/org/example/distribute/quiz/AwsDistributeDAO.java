package org.example.distribute.quiz;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.distribute.quiz.vo.LogVO;
import org.example.distribute.quiz.vo.UserVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AwsDistributeDAO {
    // MySQL JDBC URL
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/aws";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";

    private Connection con;
    private MongoCollection<Document> logCollection;

    public AwsDistributeDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
        System.out.println("Connected to MySQL");

        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver");
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("aws");
        logCollection = mongoDatabase.getCollection("activity_logs");
    }

    public void insert(UserVO user) {
        try {
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.executeUpdate();
            System.out.println("Insert Success");

            // 3. 2에서 얻은 id를 활용하여 몽고DB에 로그기록 넣기
            ResultSet rs = ps.getGeneratedKeys();
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt(1);
            }
            System.out.println("userId>> " + userId);

            Document activityLog = new Document();
            activityLog.append("userId", userId);
            activityLog.append("activity", "Login");
            activityLog.append("timestamp", "2024-11-10T10:15:00");

            Document activityLog2 = new Document();
            activityLog2.append("userId", userId);
            activityLog2.append("activity", "Order");
            activityLog2.append("timestamp", "2024-11-11T11:15:00");

            Document activityLog3 = new Document();
            activityLog3.append("userId", userId);
            activityLog3.append("activity", "Order");
            activityLog3.append("timestamp", "2024-11-21T11:15:00");

            logCollection.insertOne(activityLog);
            logCollection.insertOne(activityLog2);
            logCollection.insertOne(activityLog3);

            System.out.println("Inserted log for user ID: " + userId);
            System.out.println("Send to MongoDB");

            con.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public UserVO one(int id) {
        UserVO bag = null;
        try {
            String sql = "SELECT * FROM users WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bag = new UserVO();
                bag.setId(rs.getInt("id"));
                bag.setName(rs.getString("name"));
                bag.setEmail(rs.getString("email"));
                bag.setSignupDate(rs.getTimestamp("signup_date"));
            }
            return bag;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bag;
    }

    public ArrayList<LogVO> findLogList(int id) {
        ArrayList<LogVO> list = new ArrayList<>();
        Document filter = new Document("userId", id);
        ArrayList<Document> result = logCollection.find(filter).into(new ArrayList<>());

        for (Document document : result) {
            LogVO bag = new LogVO();
            bag.setUserId(document.getInteger("userId"));
            bag.setActivity(document.getString("activity"));
            bag.setTimestamp(document.getString("timestamp"));
            list.add(bag);
        }
        return list;
    }

}
