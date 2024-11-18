package org.example.jdbc2.practice;

import java.sql.SQLException;

public class ProductOneUI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductDAO dao = new ProductDAO();
        ProductVO bag = dao.one(1);

        System.out.println("검색한 id>> " + bag.getId());
        System.out.println("검색한 name>> " + bag.getProductName());
        System.out.println("검색한 price>> " + bag.getPrice());
        System.out.println("검색한 quantity>> " + bag.getQuantity());
    }
}
