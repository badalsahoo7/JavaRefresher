package com.example.chapter2;

public class ClassEx2 extends ClassEx{
    public void method2(){
        System.out.println("I am method 2");
    }
    public static void main(String[] args) {
        // We can access this by creating its object
        ClassEx2 obj = new ClassEx2();
        obj.method2();
        obj.method1(); // here the method 1 is available due to inheritance
    }
}
