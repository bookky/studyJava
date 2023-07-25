package com.business.service.impl;

import com.business.service.GenericAService;
import com.business.service.GenericBService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class  GenericAServiceImpl implements GenericAService {
    @Resource private GenericBService genericBService;


    @Override
    public String getGenericA() {
        List list = new ArrayList();
        genericBService.getGenericA(list);
        return "ok";
    }




}
