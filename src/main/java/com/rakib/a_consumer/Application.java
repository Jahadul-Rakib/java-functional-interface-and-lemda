package com.rakib.a_consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("R0", 13));
        personList.add(new Person("R1", 40));
        personList.add(new Person("R2", 35));
        personList.add(new Person("R3", 18));
        personList.add(new Person("R4", 19));
        personList.add(new Person("R5", 17));

        personList.forEach(person -> System.out.println("Name: "+person.getName()+", Age: "+ person.getAge()));

        System.out.println("--------------------------------------------------------------------------------");

        Consumer<Person> personConsumer = person -> System.out.println("Name: "+person.getName()+", Age: "+ person.getAge());
        personConsumer.accept(new Person("Rakib", 21));

        System.out.println("--------------------------------------------------------------------------------");
        Consumer<Person> personConsumerTwo = person -> System.out.println("Name: "+person.getName()+", Age: "+ (person.getAge()+1));
        personConsumer.andThen(personConsumerTwo).accept(new Person("Jahadul Rakib", 31));
    }
}

