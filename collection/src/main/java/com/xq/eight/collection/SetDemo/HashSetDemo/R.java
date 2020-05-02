package com.xq.eight.collection.SetDemo.HashSetDemo;

public class R {
    int count;
    public  R(int count){
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[count:"+count+"]"+"hashCode:"+hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj != null && obj.getClass() == R.class){
            R r = (R)obj;
            return this.count == r.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}
