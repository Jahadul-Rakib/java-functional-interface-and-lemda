package com.rakib.a_function;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class BiFunctionDemo {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunctionAdd = (t, n) -> (t + n);
        BiFunction<Integer,Integer,Integer> biFunctionSub = (t, n) -> (t - n);
        BiFunction<Integer,Integer,Integer> biFunctionMul = (t, n) -> (t * n);
        BiFunction<Integer,Integer,Integer> biFunctionDiv = (t, n) -> (t / n);

        System.out.println(biFunctionAdd.apply(10,23));
        System.out.println(biFunctionSub.apply(10,23));
        System.out.println(biFunctionDiv.apply(10,23));
        System.out.println(biFunctionMul.apply(10,23));

        Function<Integer, Integer> function =(number) -> {
            System.out.println(number);
            return number;
        };
        biFunctionAdd.andThen(function).apply(20,18);

    }
}
