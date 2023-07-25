package com.businessA.operation.impl;

import com.businessA.operation.StartTaskService;
import com.businessA.vo.*;
import io.micrometer.observation.Observation;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 2023/7/18
 * 0:09
 * 2023
 **/
@Service
public class StartRealTaskServiceImpl implements StartTaskService<RealTask> {
    private TaskParam<RealTask> realTaskTaskParam;

    @Override
    public void startTask(RealTask realTask) {

        TaskParam<RealTask> realTaskTaskParam = new TaskParam<RealTask>().of(TaskEnum.START_TASK);
        TaskParam<VirtualTask> virtualTaskTaskParam = new TaskParam<VirtualTask>().of(TaskEnum.START_TASK);
        TaskParam<AutomaticTask> automaticTaskTaskParam = new TaskParam<AutomaticTask>().of(TaskEnum.START_TASK);


        TaskContext taskContext = new TaskContext();
        taskContext.getTaskParamMap().put(TypeEnum.REAL_TASK, realTaskTaskParam);



    }


    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (firstName, lastName) -> firstName + "_" + lastName;
        String fullName = biFunction.apply("bill", "john");
        System.out.println(fullName);


        Map<String,String> s= new HashMap<String,String>(){{
            Observation.CheckedCallable<String, Throwable> li = () -> put("li", "2222");
        }};


        Function<Integer, Integer> function = (a) -> a / 10;
        Function<Integer, Integer> functionB = (a) -> a + 50;

        Function<Integer, Integer> functionC = functionB.compose(function);
        System.out.println(functionC.apply(100));



        Function<Integer, Integer> functionD = (a) -> a + 50;
        Function<Integer, Integer> functionE = functionD.andThen(function);
        System.out.println(functionE.apply(100));
        System.out.println(Function.identity());



//        int b = function.apply(100);
//        System.out.println(b);


    }



}
