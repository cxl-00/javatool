package com.cxl.toolproj.designmode.singleton;

import java.util.ArrayList;

public class SingletonExtendMulti {
    public static void main(String[] args){
        Multiton.getRandomInstance();
        Multiton.getRandomInstance();
        Multiton.getRandomInstance();
        Multiton.getRandomInstance();
        Multiton.getRandomInstance();
    }
   
}
class Multiton {
    private static ArrayList<Multiton> list = new ArrayList<Multiton>() ;
    public  static final int count = 10;
    private Multiton(int n){
        System.out.println("实例1"+n);
    }
    static {
        for(int i = 0;i<count;i++){
            list.add(new Multiton(i));
        }
    }

    public static Multiton getRandomInstance(){
        int value = (int)(Math.random()*count);
        return list.get(value);
    }
}


