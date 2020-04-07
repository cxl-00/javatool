package com.cxl.toolproj.designmode.singleton;

public class LazyDemo1 {
    public static void main(String[] args){
        President p1 = President.getInstance();
        p1.getName();
        President p2 = President.getInstance();
        p2.getName();
        if(p1 == p2){
            System.out.println("同一个人");
        }else{
            System.out.println("不是同一个人");
        }

    }


}
class President{
    private static volatile President instance = null;
    private President(){
        System.out.println("产生一个总统！");
    }
    public static synchronized President getInstance(){
        if(instance == null){
            instance = new President();
        }else{
            System.out.println("已经产生一个总统了，不能在产生总统");
        }
        return instance;
    }
    public void getName(){
        System.out.println("我是总统xxxx");
    }
}