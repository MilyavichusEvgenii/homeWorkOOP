package org.lesson_1;

public class Main {
    public static void main(String[] args) {

        Category eat = new Category("eat", "bread", 50, 8);
        Category book = new Category("book", "magazine", 100, 6);
        User ivan = new User("Иван", "123456");
        User vlad = new User("Влад", "123456");
        Store store = new Store();
        store.allProduct(eat, book);
        store.bueProduct(ivan, eat, 5);
        store.bueProduct(vlad, book, 2);


    }
}