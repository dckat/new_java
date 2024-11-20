package org.example.mongo.select;

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
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member 컬렉션 연결 성공~!");

        //3. 전송할 js생성

        //4. 전송, 결과처리
        FindIterable<Document> result = member.find();
        for (Document doc : result) {
            System.out.println(doc.getString("id"));
            System.out.println(doc.getString("pw"));
            System.out.println(doc.getString("name"));
            System.out.println(doc.getString("tel"));
            System.out.println("------------------------");
        }

        List<Document> result2 = member.find().into(new ArrayList<>());
        for (int i = 0; i < result2.size(); i++) {
            System.out.println(result2.get(i).getString("id"));
            System.out.println(result2.get(i).getString("pw"));
            System.out.println(result2.get(i).getString("name"));
            System.out.println(result2.get(i).getString("tel"));
            System.out.println("-------------------------");
        }
        client.close();
    }
}
