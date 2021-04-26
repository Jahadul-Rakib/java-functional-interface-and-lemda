package com.rakib.a_function;

import java.util.function.Function;

public class Application {
    public static void main(String[] args) {

        Function<Integer, String> functionOne = (number) -> {
            if (number % 2 == 0) {
                return "Number " + number + " is Even";
            } else {
                return "Number " + number + " is odd";
            }
        };
        System.out.println(functionOne.apply(10));
        System.out.println(functionOne.apply(11));

        Function<String, String> functionTwo = String::toUpperCase;
        Function<String, String> functionThree = s -> s+".....Chain is Done.";

        String apply = functionOne.andThen(functionTwo).andThen(functionThree).apply(15);
        System.out.println(apply);


    }
}
