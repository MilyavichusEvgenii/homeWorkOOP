package org.lesson_1;

import java.io.PrintStream;
import java.util.ArrayList;

public class User extends Basket{
    private String login;
    private String password;
    private Basket basket = new Basket();


    protected User(String login, String password){
        this.login = login;
        this.password = password;
    }
    public String getLogin(){

        return this.login;
    }
    public String getPassword(){

        return this.password;
    }
    public PrintStream getInfo(){
        System.out.printf("User: login = %s, password = %s \n", this.login, this.password);
        return null;
    }
    public ArrayList getArraylist(){
        return this.basket.bueProduct;
    }
    public void setArrayList(Product obj){
        this.basket.bueProduct.add(obj);
    }




}
