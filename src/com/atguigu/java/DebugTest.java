package com.atguigu.java;

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {
        int a=5;
        int b=add(a);
        System.out.println("b = " + b);
        HashMap<String,String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","12");
        map.put("school","qinghua");
        map.put("major","computer");

        String age=map.get("age");
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }

    }
    
    public static int add(int c){
        int b=c+5;
        int e=b+5;
        int d=e+5;
        return d;
        
    }
}
