package com.xq.eight.collection.SetDemo.TreeSetDemo;

public class Z implements Comparable{

    int age;

    public Z(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
