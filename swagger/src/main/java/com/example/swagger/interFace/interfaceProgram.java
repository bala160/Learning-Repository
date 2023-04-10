package com.example.swagger.interFace;

import java.sql.SQLOutput;

interface met {
    void met();
}

interface met1{
    void met1();
}
public class interfaceProgram implements met,met1{


        public void met() {
            System.out.println("Success");
        }

        public void met1() {
            System.out.println("Success2");
        }

    
    

    public static void main(String[] args) {
        interfaceProgram m = new interfaceProgram();
        m.met();
        m.met1();
    }
}
