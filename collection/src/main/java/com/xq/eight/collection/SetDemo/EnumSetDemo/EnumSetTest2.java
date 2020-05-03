package com.xq.eight.collection.SetDemo.EnumSetDemo;

import java.util.*;

public class EnumSetTest2 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.clear();
        c.add(Season.FAIL);
        c.add(Season.SPRING);

        EnumSet enumSet = EnumSet.copyOf(c);
        System.out.println(enumSet);

        c.add("清平乐");
        c.add("好看");

        enumSet = EnumSet.copyOf(c);
    }

    SortedSet s = Collections.synchronizedSortedSet(new TreeSet<>());
}
