package com.example.swagger.abstractClass;

abstract class abstractClass {
    abstract void employee();
}

class sam extends abstractClass {
    void employee() {
        System.out.print("Developer");
    }
}

class main{
    public static void main(String[] args) {
        abstractClass a = new sam();
        a.employee();
    }
}