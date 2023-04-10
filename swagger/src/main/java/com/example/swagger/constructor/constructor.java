package com.example.swagger.constructor;

public class constructor {

    /**
     * Special method
     * Same name as class name
     * No return type
     * Immediately calling when an object is created
     * used for initialize values
     *
     * constructor not have static method
     */
    int num1;
    int num2;

    constructor(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    void setNum(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public static void main(String[] args) {

        constructor c = new constructor(1,2);
        System.out.println(c.num1);
        System.out.println(c.num2);

        c.setNum(3,4);
        System.out.println(c.num1);
        System.out.println(c.num2);
    }
}
