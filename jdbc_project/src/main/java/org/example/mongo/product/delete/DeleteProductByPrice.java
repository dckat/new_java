package org.example.mongo.product.delete;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeleteProductByPrice {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("shop");
        MongoCollection<Document> collection = database.getCollection("product");

        String category = "Clothing";
        int price = 30000;
        Document doc = new Document("category", category)
                .append("price", new Document("$gte", price));

        List<Document> list = collection.find(doc).into(new ArrayList<>());
        System.out.println(list.size());
        collection.deleteMany(doc);
        System.out.println("30000 이상 Clothing 삭제 완료");
        mongoClient.close();
    }
}
