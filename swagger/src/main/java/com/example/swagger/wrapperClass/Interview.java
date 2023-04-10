package com.example.swagger.wrapperClass;

public class Interview {

    void Interview(int a, int b){

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        Interview i = new Interview();
        i.Interview(10,25);
    }
}
