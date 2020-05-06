package com.xq.eight.collection.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();

        books.add(new String("Little Women"));
        books.add(new String("疯狂讲义"));
        books.add(new String("开发手册"));

        System.out.println(books);
        books.add(1,new String("疯狂Ajax讲义"));
        for (int i = 0;i < books.size(); i++){
            System.out.println(books.get(i));
        }

        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf(new String("疯狂Ajax讲义")));

        books.set(1,new String("疯狂讲义"));
        System.out.println(books);
        System.out.println(books.subList(1,2));
    }
}
