package com.xworkz.collections.genericsRecap.example2;

public class ProductRunner {
    public static void main(String[] args) {
        Product<Integer,String,Double> product=new Product<>(9832,"Maagi(mega)",60.99);
        product.display();

    }
}
