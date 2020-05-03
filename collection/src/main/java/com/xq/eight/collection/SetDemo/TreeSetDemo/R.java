package com.xq.eight.collection.SetDemo.TreeSetDemo;

public class R implements Comparable{
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[count:]"+count+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj != null && obj instanceof R){
            R r = (R)obj;
            return r.count == this.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R)o;
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}
