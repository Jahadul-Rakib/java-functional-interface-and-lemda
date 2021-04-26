package com.rakib.functional_interfaces_way;

@FunctionalInterface
public interface GenericInterface<T> {
    T computeData(T t);
}
