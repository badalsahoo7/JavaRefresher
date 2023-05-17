package com.example.chapter2;

import java.util.ArrayList;

public class ArraysPractice {
    public static void main(String[] args) {
        int [] marks = {22,33,55,66,77};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        ArrayList list = new ArrayList();
        list.add(22);
        list.add("222");
        list.add(24);
        // printing the objects
        for (Object o:list){
            System.out.println("Object is "+o);
        }
    }
}
