package com.businessA.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2023/7/18
 * 0:43
 * 2023
 **/
public class TaskContext {

    private Map<TypeEnum, TaskParam<?>> taskParamMap = new HashMap<>();

    public Map<TypeEnum, TaskParam<?>> getTaskParamMap() {
        return taskParamMap;
    }

    public void setTaskParamMap(Map<TypeEnum, TaskParam<?>> taskParamMap) {
        this.taskParamMap = taskParamMap;
    }
}
