package org.example.mongo.select;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionTest2 {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        Bson filter = new Document("tel", "665-786-0090");
        MongoClient mongoClient = new MongoClient(
                new MongoClientURI(
                        "mongodb://localhost:27017/"
                )
        );
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("member");
        FindIterable<Document> result = collection.find(filter);
        System.out.println("id: " + result.first().getString("id"));
        System.out.println("pw: " + result.first().getString("pw"));
        System.out.println("name: " + result.first().getString("name"));
        System.out.println("tel: " + result.first().getString("tel"));
    }
}
