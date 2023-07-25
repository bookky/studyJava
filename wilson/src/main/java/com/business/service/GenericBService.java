package com.business.service;

import java.util.Collection;

public interface GenericBService<T extends Collection> {

    String getGenericA(T t);
    String getGenericB();

    String getGenericC();

    String getGenericD();

    String getGenericE();
}
