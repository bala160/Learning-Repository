package com.example.swagger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
       /* int[] arr = {1, 2, 2, 3, 4};

        HashSet<Integer> data = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            data.add(arr[i]);
        }

        data.forEach(res -> System.out.println(res));*/

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("name"+name);

        String[] nam = name.split(" ");

        for(int i = 0;i< nam.length;i++){
            //System.out.println(nam[i]);
        }

        /*String first = nam[0];
        String second = nam[1];
        String third = nam[2];

        System.out.println(first.charAt(0)+" "+second.charAt(0)+" "+third);*/

        System.out.println(nam[0].substring(0,1)+" "+nam[1].substring(0,1)+" "+nam[2]);

    }


}
