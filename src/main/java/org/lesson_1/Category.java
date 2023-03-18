package org.lesson_1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Category extends Product{
    protected String nameCt;
    protected ArrayList<Product> assortment = new ArrayList<Product>();


    protected Category(String nameCt, String name, int price, int rating) {
        super(name, price, rating);
        this.nameCt = nameCt;

    }
    public ArrayList getAssort(){
        return assortment;
    }
    public void removeProduct(){
        assortment.remove(assortment.size() - 1);
    }
    @Override
    public PrintStream getInfo(){
        System.out.printf("Name category: %s, name product: %s, price: %d, rating: %d.", nameCt, namePr, price, rating);
        return null;
    }
    public void fullCat(){
        for (int i = 0; i < 11; i++) {
            this.assortment.add(new Product(namePr, price, rating));

        }
    }
}


