package org.example.mongo.naver.delete;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoDBDeleteAll {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");

        // 특정 서비스에 속하는 모든 회원 정보 삭제
        String serviceName = "Cafe"; // 삭제할 서비스 이름
        Document query = new Document("service", serviceName);
        collection.deleteMany(query);
        System.out.println(serviceName + " 서비스에 속하는 모든 회원 정보 삭제 완료.");
        mongoClient.close();
    }
}
