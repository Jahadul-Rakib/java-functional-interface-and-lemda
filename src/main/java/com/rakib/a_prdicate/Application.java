package com.rakib.a_prdicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Predicate<Person> personPredicate = (person) -> person.getAge() > 18;
        boolean test = personPredicate.test(new Person(30));
        if (test)
            System.out.println("you are adult.");
        else
            System.out.println("you are children.");

        List<Integer> integerList = Arrays
                .asList(1, 2, 3, 4, 5, 6, 7, 20, 130, -2, 16, 59, 84);
        Predicate<Integer> predicate = (number) -> number > 0;
        integerList.stream()
                .filter(predicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {
        private Integer age;

        public Person(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
