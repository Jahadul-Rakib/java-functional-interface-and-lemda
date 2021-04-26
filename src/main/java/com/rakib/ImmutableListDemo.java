package com.rakib;

import java.util.*;
import java.util.stream.Collectors;

public class ImmutableListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //before java 9
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        //after Java 9
        List<String> listList = List.of("AA","BB","CC");
        Set<String> stringSet = Set.of("A","B","C");
        Map<Integer,String> map = Map.ofEntries(Map.entry(1,"Rakib"), Map.entry(1,"Jahadul"));

    }
}
