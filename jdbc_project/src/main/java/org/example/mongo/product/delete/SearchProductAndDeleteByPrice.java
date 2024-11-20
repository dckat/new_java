package org.example.mongo.product.delete;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchProductAndDeleteByPrice {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("product");

        String category = "Books";
        int price = 25000;
        Document query = new Document("category", category)
                .append("price", new Document("$gte", price));

        for (Document doc : collection.find(query)) {
            System.out.println(doc.toJson());
        }
        collection.deleteMany(query);
        System.out.println("25000 이상 Books 삭제 완료");
        mongoClient.close();
    }
}
