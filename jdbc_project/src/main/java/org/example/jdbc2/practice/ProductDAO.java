package org.example.jdbc2.practice;


import java.sql.*;
import java.util.ArrayList;

public class ProductDAO {
    private Connection con;

    public ProductDAO() throws ClassNotFoundException, SQLException {
        // 1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        // 2. db 연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db 연결 성공!");
    }

    public ProductVO one(int id) throws SQLException {
        String sql = "select * from Product where ProductID = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();
        ProductVO bag = null;
        if (rs.next()) {
            bag = new ProductVO();
            bag.setId(rs.getInt("ProductID"));
            bag.setProductName(rs.getString("ProductName"));
            bag.setPrice(rs.getDouble("Price"));
            bag.setQuantity(rs.getInt("Quantity"));
        }
        rs.close();
        ps.close();
        con.close();

        return bag;
    }

    public ArrayList<ProductVO> list() throws SQLException {
        ArrayList<ProductVO> list = null;
        String sql = "select * from Product";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            if (list == null) {
                list = new ArrayList<>();
            }
            ProductVO bag = new ProductVO();
            bag.setId(rs.getInt("ProductID"));
            bag.setProductName(rs.getString("ProductName"));
            bag.setPrice(rs.getDouble("Price"));
            bag.setQuantity(rs.getInt("Quantity"));

            list.add(bag);
        }
        rs.close();
        ps.close();
        con.close();

        return list;
    }
}
