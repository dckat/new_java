package org.example.mongo.product.insert;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ElectronicInsert {
    public static void insertElectronicProduct() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("product");

        Document electronicProduct1 = new Document("name", "Smartphone")
                .append("category", "Electronics")
                .append("price", 500000)
                .append("brand", "Samsung")
                .append("description", "Latest model with 5G support");

        Document electronicProduct2 = new Document("name", "Laptop")
                .append("category", "Electronics")
                .append("price", 1200000)
                .append("brand", "Apple")
                .append("description", "High-perforance laptop");

        collection.insertOne(electronicProduct1);
        collection.insertOne(electronicProduct2);
        mongoClient.close();
        System.out.println("Inserted ElectronicProduct");
    }
}
