package com.rakib.a_prdicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> predicate = (s1, s2) -> s1.equals(s2);
        BiPredicate<Integer, Integer> predicate2 = (s1, s2) -> s1 > s2;

        System.out.println(predicate.test(10, 10));
        System.out.println(predicate.test(10, 11));

        boolean test = predicate.and(predicate2).test(10, 10);
        System.out.println("Final Test And Condition: "+test);

        boolean test2 = predicate.or(predicate2).test(10, 10);
        System.out.println("Final Test Or Condition: "+test2);

    }
}
