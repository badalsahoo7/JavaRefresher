package com.example.chapter2;

public class FunctionsPractice {


    public static double avg (int a,int b,int c){
        return (a+b+c)/3.0f;
    }
    public static void main(String[] args) {
//        int a = 22;
//        int b = 33;
//        int c = 24;
//        float avg = (a+b+c)/3.0f;
//        System.out.println(avg);
        // You can pack this logic in a function , if you need to define the avg of many numbers

        // you can call the function
        System.out.println(avg(22,44,55));
    }
}
