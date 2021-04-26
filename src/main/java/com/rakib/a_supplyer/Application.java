package com.rakib.a_supplyer;

import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Hello";
        String s = supplier.get();
        System.out.println(s);
    }
}
