package org.example.mongo.product.insert;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ClothingInsert {
    public static void insertClothingProduct() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("product");

        Document clothingProduct1 = new Document("name", "T-shirt")
                .append("category", "Clothing")
                .append("price", 20000)
                .append("brand", "Nike")
                .append("description", "Comfortable cotton fabric");

        Document clothingProduct2 = new Document("name", "Jeans")
                .append("category", "Clothing")
                .append("price", 45000)
                .append("brand", "Levi's")
                .append("description", "Classic blue jeans");

        collection.insertOne(clothingProduct1);
        collection.insertOne(clothingProduct2);
        mongoClient.close();
        System.out.println("Inserted ClothingProduct");
    }
}
