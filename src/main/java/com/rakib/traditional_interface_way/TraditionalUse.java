package com.rakib.traditional_interface_way;

public class TraditionalUse {

    public static void main(String[] args) {
        TraditionalWay way = new TraditionalWayImpl();
        String wayData = way.getData("rakib");
        System.out.println(wayData);
    }
}
