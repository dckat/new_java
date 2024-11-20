package org.example.mongo.naver.delete;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoDBSearchAndDelete {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");

        // 회원 이름으로 검색
        String serviceName = "Line"; // 검색할 서비스 이름
        String name = "김유신"; // 검색할 이름
        Document query = new Document("service", serviceName).append("name", name);
        Document member = collection.find(query).first();
        if (member != null) {
            System.out.println("검색된 회원 정보: " + member.toJson());

            // 회원 정보 삭제
            collection.deleteOne(query);
            System.out.println(name + "님의 회원 정보 삭제 완료.");
        } else {
            System.out.println(name + "님의 회원을 찾을 수 없습니다 .");
            mongoClient.close();
        }
    }
}
