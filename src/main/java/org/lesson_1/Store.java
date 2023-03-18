package org.lesson_1;

import java.util.Arrays;

public class Store {

    public void allProduct(Category obj, Category obj1){
        obj.getInfo();
        System.out.println();
        obj1.getInfo();
        System.out.println();

    }

    public void bueProduct(User user, Category obj, int products){
        obj.fullCat();
        System.out.printf("%d remains of product in store\n",obj.getAssort().size());
        int count = 0;
        while (count < products){
            obj.removeProduct();
            user.setArrayList((Product) obj.getAssort().get(count));
            count++;
        }
        user.getInfo();
        System.out.printf("%d quantity of product in basket\n", user.getArraylist().size());
        obj.getInfo();
        System.out.println();
        System.out.printf("%d remains of product in store\n",obj.getAssort().size());


        
        System.out.println();
    }

}
