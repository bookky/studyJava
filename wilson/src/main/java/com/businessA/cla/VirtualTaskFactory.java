package com.businessA.cla;

import com.businessA.abs.AbsFactory;
import com.businessA.operation.StartTaskService;
import com.businessA.operation.StopTaskService;
import org.springframework.stereotype.Service;

/**
 * 2023/7/18
 * 0:13
 * 2023
 **/
@Service
public class VirtualTaskFactory implements AbsFactory {


    @Override
    public StartTaskService getStartTask() {
        return null ;
    }

    @Override
    public StopTaskService getStopTask() {
        return null;
    }
}
