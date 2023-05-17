package com.example.chapter2;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello Badal");
        String name = "My name is Badal";
        System.out.println(name);
        System.out.println(name.substring(4,6));

        int a = 22;
        int b = 23;
        float f = 22.2f;
        double d = 22.4;
        boolean isTrue = false;
        System.out.println(a+f);
        // This is single line comment ctrl+/
        // This is multi line comment ctrl+shift+/
        // If-else in Java
        int age = 8;
        if (age>18){

            System.out.println("Yes Boy you can drive!");
        }
        else {
            if (age==8){
                System.out.println("Wow , This is an 8");
            }
            System.out.println("NO Boy you can not drive yet!");
        }

        // Loops in Java
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }

    }
}