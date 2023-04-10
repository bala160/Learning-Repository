package com.example.swagger.InterviewPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class reverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        Iterator<Integer> i = l.descendingIterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
