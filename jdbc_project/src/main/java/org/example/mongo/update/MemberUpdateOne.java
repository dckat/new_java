package org.example.mongo.update;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MemberUpdateOne {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        // 1. MongoClient 생성
        MongoClient client = new MongoClient("localhost", 27017);

        // 2. db연결, collection 연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member 컬렉션 연결 성공!!");

        // 3. 전송할 js 생성
        Document filter = new Document();
        filter.append("id", "kim");     // {id: "kim"}

        // 수정할 내용 지정
        Bson pw = Updates.set("pw", "pass");    // {$set: {pw: "pass"}}

        // 4. 전송, 결과처리
        member.updateOne(filter, pw);
        client.close();
    }
}
