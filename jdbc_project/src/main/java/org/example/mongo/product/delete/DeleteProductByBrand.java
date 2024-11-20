package org.example.mongo.product.delete;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteProductByBrand {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("product");

        String category = "Clothing";
        String bName = "Nike";
        Document query = new Document("category", category)
                .append("brand", bName);

        collection.deleteMany(query);
        System.out.println("Nike Clothing 삭제 완료");
        mongoClient.close();
    }
}
