package com.example.swagger.jumpStatement;

public class breakStatement {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
    }
}
