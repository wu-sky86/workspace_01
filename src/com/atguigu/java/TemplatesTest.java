package com.atguigu.java;

import com.atguigu.bean.Customer;

public class TemplatesTest {
    //模板五：prsf
    private static final Customer cust = new Customer();
    //psf
    public static final int NUM=5;
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout,soutv
        System.out.println("hello");
        int num1=20;
        System.out.println("num1 = " + num1);
        //模板三：fori
        String[] arr =new String[]{"Tom","JREEY","LILEI"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //模板四：ifn
        String unm2 = "yesyw";
        if (unm2 == null) {
            System.out.println("hehe");
        }
    }
}
