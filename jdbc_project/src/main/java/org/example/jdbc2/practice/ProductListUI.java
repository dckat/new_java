package org.example.jdbc2.practice;

import org.apache.commons.math3.stat.descriptive.summary.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductListUI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductDAO dao = new ProductDAO();
        ArrayList<ProductVO> list = dao.list();

        if (list != null) {
            for (ProductVO bag : list) {
                System.out.println("검색한 id>> " + bag.getId());
                System.out.println("검색한 name>> " + bag.getProductName());
                System.out.println("검색한 price>> " + bag.getPrice());
                System.out.println("검색한 quantity>> " + bag.getQuantity());
                System.out.println("-------------------------");
            }
        }
        else {
            System.out.println("검색 결과가 없음!");
        }
    }
}
