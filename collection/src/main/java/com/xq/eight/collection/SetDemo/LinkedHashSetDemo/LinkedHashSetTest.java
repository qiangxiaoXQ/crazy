package com.xq.eight.collection.SetDemo.LinkedHashSetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();
        books.add("今天5点去看日落吧");
        books.add("好呀");
        System.out.println(books);
        books.remove("今天5点去看日落吧");
        books.add("今天5点去看日落吧");
        System.out.println(books);

        System.out.println(books.add("好呀"));

        System.out.println(books);
    }
}
