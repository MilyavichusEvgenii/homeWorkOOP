package org.lesson_1;

import java.io.PrintStream;
import java.util.Random;

public class Product {
    protected static Random r;
    protected String namePr;
    protected int price;
    protected int rating;
    static {
        Product.r = new Random();
    }
    protected Product(String name, int price, int rating){
        this.namePr = name;
        this.price = price;
        this.rating = rating;
    }
    public void SetName(String value){
        this.namePr = value;
    }
    public void setPrice(int value){
        this.price = value;
    }
    public void SetRating(int value){
        this.rating = value;
    }
    public String getNamePr(){
        return this.namePr;
    }
    public int getPrice(){
        return this.price;
    }
    public int getRating(){
        return this.rating;
    }
    public PrintStream getInfo(){
        return System.out.printf("name: %s, price: %d, rating: %d", namePr, price, rating);
    }

}
