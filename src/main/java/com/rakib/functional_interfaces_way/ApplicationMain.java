package com.rakib.functional_interfaces_way;

public class ApplicationMain {
    public static void main(String[] args) {
        FunctionInterface functionInterface = name -> name.toLowerCase();
        System.out.println("Print from 'Function' functional interface: " + functionInterface.print("Rakib"));

        BiFunctionInterface biFunctionInterface = (a, b) -> a * b;
        System.out.println("Print from 'BiFunctionDemo' functional interface: " + biFunctionInterface.print(10, 3));

        GenericInterface<Integer> integerGenericInterface = (value) -> value * value;
        System.out.println(integerGenericInterface.computeData(3));
        GenericInterface<String> stringGenericInterface = (value) -> value.toUpperCase();
        System.out.println(stringGenericInterface.computeData("rakib"));


        GenericInterface2<Integer, String> genericInterface2 = (value) -> value.toString()+" is String Type";
        System.out.println("Different Return type Functional Interface: "+ genericInterface2.compute(5));
    }

}
