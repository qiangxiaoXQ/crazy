package com.xq.eight.collection.SetDemo.TreeSetDemo;

import java.util.Date;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        System.out.println(nums);
        System.out.println(nums.first());
        System.out.println(nums.last());
        System.out.println(nums.headSet(4));
        System.out.println(nums.tailSet(5));
        System.out.println(nums.subSet(-3,4));

        Date date = new Date();
        Date date1 = new Date();
        date.compareTo(date1);
    }
}
