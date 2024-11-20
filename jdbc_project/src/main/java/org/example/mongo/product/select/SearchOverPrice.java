package org.example.mongo.product.select;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchOverPrice {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("product");

        String category = "Electronics";
        int price = 1000000;

        Document query = new Document("category", category).append("price", new Document("$gte", price));

        for (Document doc : collection.find(query)) {
            System.out.println(doc.toJson());
        }
    }
}
