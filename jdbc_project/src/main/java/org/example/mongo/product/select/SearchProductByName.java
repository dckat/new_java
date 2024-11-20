package org.example.mongo.product.select;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchProductByName {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("product");

        String category = "Electronics";
        String keyword = "Smart";
        Document filter = new Document("category", category)
                .append("name", new Document("$regex", keyword));

        FindIterable<Document> documents = collection.find(filter);
        for (Document document : documents) {
            System.out.println(document.toJson());
        }
        mongoClient.close();
    }
}
