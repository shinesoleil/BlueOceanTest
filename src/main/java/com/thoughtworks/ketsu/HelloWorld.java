package com.thoughtworks.ketsu;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String text = greeter.greet("Andy");
        System.out.println(text);
    }
}
