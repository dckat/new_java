package org.example.mongo.select.practice;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MemberSearchMany {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        //1. MongoClient생성
        MongoClient client = new MongoClient("localhost", 27017);

        //2. db연결, collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("memo");
        System.out.println("member 컬렉션 연결 성공~!");

        //3. 전송할 js생성
        Document filter = new Document();
        filter.append("office", "busan");

        //4. 전송, 결과처리
        FindIterable<Document> result = member.find(filter);
        for (Document doc : result) {
            System.out.println("name: " + doc.getString("name"));
            System.out.println("age: " + doc.getInteger("age"));
            System.out.println("office: " + doc.getString("office"));
            System.out.println("phone: " + doc.getString("phone"));
            System.out.println("------------------------");
        }
        client.close();
    }
}
