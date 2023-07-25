package com.businessA.cla;

import com.businessA.abs.AbsFactory;
import com.businessA.operation.StartTaskService;
import com.businessA.operation.StopTaskService;
import com.businessA.vo.RealTask;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * 2023/7/18
 * 0:13
 * 2023
 **/
@Service
public class RealTaskFactory implements AbsFactory {

    @Override
    @Qualifier("StartRealTaskServiceImpl")
    @Bean
    public StartTaskService<RealTask> getStartTask() {
        return null;
    }

    @Override
    public StopTaskService getStopTask() {
        return null;
    }
}
