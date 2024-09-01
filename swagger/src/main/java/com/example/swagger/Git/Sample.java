package com.example.swagger.Git;

public class Sample {
    public static void main(String[] args) {
        String[] name = {"Krish","Rahul","Jack"};

        for(String result : name){
            if(!result.equalsIgnoreCase("Jack"))
            System.out.print(result + ","+ " ");
            else{
                System.out.print(result);
            }

        }


        int M = 3;
        int j = 4;
        System.out.println(M+j);
    }
}
