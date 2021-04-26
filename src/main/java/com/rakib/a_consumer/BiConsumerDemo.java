package com.rakib.a_consumer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> consumerAdd = (data1, data2) -> System.out.println(data1 + data2);
        BiConsumer<Integer, Integer> consumerSub = (data1, data2) -> System.out.println(data1 - data2);
        BiConsumer<Integer, Integer> consumerDiv = (data1, data2) -> System.out.println(data1 / data2);
        BiConsumer<Integer, Integer> consumerMul = (data1, data2) -> System.out.println(data1 * data2);

        consumerAdd.accept(20, 15);



        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java 1.0");
        map.put(2, "Java 7.0");
        map.put(3, "Java 8.0");
        map.put(4, "Java 11.0");

        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
