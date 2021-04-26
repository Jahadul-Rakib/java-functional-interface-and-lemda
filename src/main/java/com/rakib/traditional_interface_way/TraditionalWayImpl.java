package com.rakib.traditional_interface_way;

public class TraditionalWayImpl implements TraditionalWay{

    @Override
    public String getData(String data) {
        return data.toUpperCase();
    }
}
