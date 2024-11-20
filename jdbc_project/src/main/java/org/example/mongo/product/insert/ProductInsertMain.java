package org.example.mongo.product.insert;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductInsertMain {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        ElectronicInsert.insertElectronicProduct();
        ClothingInsert.insertClothingProduct();
        BookInsert.insertBookProduct();
    }
}
