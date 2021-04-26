package com.rakib.functional_interfaces_way;

@FunctionalInterface
public interface GenericInterface2<T,R> {
    R compute(T t);
}
