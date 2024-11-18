package org.example.jdbc2.practice;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductVO {
    private int id;
    private String productName;
    private double price;
    private int quantity;
}
