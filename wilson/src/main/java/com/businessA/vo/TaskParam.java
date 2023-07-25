package com.businessA.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 2023/7/18
 * 0:20
 * 2023
 **/
public class TaskParam<T> {
    private TaskEnum taskEnum;
    private List<T> listA;
    private List<T> listB;
    private List<T> listC;

    public TaskParam<T> of(TaskEnum taskEnum) {

        this.taskEnum = taskEnum;
        this.listA = new ArrayList<>();
        return this;
    }






    public List<T> getListA() {
        return listA;
    }

    public void setListA(List<T> listA) {
        this.listA = listA;
    }

    public List<T> getListB() {
        return listB;
    }

    public void setListB(List<T> listB) {
        this.listB = listB;
    }

    public List<T> getListC() {
        return listC;
    }

    public void setListC(List<T> listC) {
        this.listC = listC;
    }


}
