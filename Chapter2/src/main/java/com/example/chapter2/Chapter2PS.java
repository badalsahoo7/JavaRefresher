package com.example.chapter2;

public class Chapter2PS {
    public static void main(String[] args) {
        // Problem 1
        int a = 5;
        for (int i = 1;i<=10;i++){
            System.out.println(a + "X" +i + "="+ a*i);
        }
        // problem 4
        int sum =0;
        int i = 0;
        int n = 3;
        while (i<n){
            sum+=2*i;
            i++;
        }
        System.out.println(sum);
    }
}
