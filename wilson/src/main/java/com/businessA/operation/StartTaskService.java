package com.businessA.operation;

/**
 * 2023/7/18
 * 0:09
 * 2023
 **/
@FunctionalInterface
public interface StartTaskService<T> {
    public abstract void  startTask(T t);
}
