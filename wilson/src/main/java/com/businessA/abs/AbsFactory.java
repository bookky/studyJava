package com.businessA.abs;

import com.businessA.operation.StartTaskService;
import com.businessA.operation.StopTaskService;

/**
 * 2023/7/18
 * 0:08
 * 2023
 **/
public interface AbsFactory {
    StartTaskService getStartTask();
    StopTaskService getStopTask();

}
