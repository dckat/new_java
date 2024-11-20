package org.example.mongo.product.insert;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class BookInsert {
    public static void insertBookProduct() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("product");

        Document bookProduct1 = new Document("name", "Java Programming")
                .append("category", "Books")
                .append("price", 35000)
                .append("author", "John Doe")
                .append("description", "Learn Java programming");

        Document bookProduct2 = new Document("name", "The Great Gatsby")
                .append("category", "Books")
                .append("price", 20000)
                .append("author", "F.scott Fitzgerald")
                .append("description", "Classic American novel");

        collection.insertOne(bookProduct1);
        collection.insertOne(bookProduct2);
        mongoClient.close();
        System.out.println("Inserted BookProduct");
    }
}
