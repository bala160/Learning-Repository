package com.example.swagger.Git;

public class Sample {
    public static void main(String[] args) {
        String[] name = {"Bala","Rahul","Jack"};

        for(String result : name){
            if(!result.equalsIgnoreCase("Jack"))
            System.out.print(result + ","+ " ");
            else{
                System.out.print(result);
            }

        }

        int i = 1;
        int j = 2;
        System.out.println(i+j);
    }
}
