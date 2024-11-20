package org.example.mongo.naver.insert;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NaverInsertMain {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoDBBlogInsert.insertBlogMember();
        MongoDBCafeInsert.insertCafeMember();
        MongoDBLineInsert.insertLineMember();
    }
}
