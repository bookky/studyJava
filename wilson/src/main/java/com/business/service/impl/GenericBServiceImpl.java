package com.business.service.impl;

import com.business.service.GenericBService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


/**
 * 1 泛型类和泛型方法互不冲突。类方法不定义泛型，可以有泛型方法。泛型类可以没有泛型方法。
 * 2
 * 3 类定义的泛型参数，可以不使用。
 * 4 类定义的泛型参数，可以用在成员变量，成员方法的入参，成员方法的出参。静态成员不能使用泛型
 * 5 泛型接口在被继承或实现时确认类型，
 *      5.1 指定类型。
 *      5.2 如果没有指定，则是Object,并且被继承或实现的类或方法需把对应的类型参数传给他。占位符字母可以与接口定义的不一样。当这个不确定的类或方法被调用时一直往下，直到确定类型(不推荐)。
 *      (特别：泛型接口如果参数类型是有上届或下届时，子类也需标明上届或下届, 比如 接口是<T extends Number>， 类是<T extends Number> 或 <T extends Integer>)
 *
 *
 * 类型参数：
 * T
 *  1 确认了是某种类型，并且由被调用方去确定真正的具体类型。（被调用的最后被确定）
 *  2 不能用在静态方法
 *
 *
 * ?
 *  1 不确定是哪种类型(就算最终都没确定好像也没问题)
 *  2 可以用在静态方法
 *  3 由于不确定类型，所以不能使用?的具体方法，除非有上届或下届
 *
 */

@Service
public class GenericBServiceImpl<T extends Collection> implements GenericBService<T> {

    private T t;

    @Override
    public String getGenericA(Collection t) {
        System.out.println(t);
        return "ok";
    }

    /**
     *
     */
    @Override
    public String getGenericB() {
        List<T> list = new ArrayList<>();
        list.add(t);
        this.printListTExtendForT(list);
        return "ok";
    }
    //这个方法用到T参数，但方法没有声明是T的泛型方法，所以T是引用了类声明的类型参数
    //当给方法传参时必须是T类型，这里类的类型参数就是T。
    private void printListTExtendForT(List<T> list){
        System.out.println(list);
    }


    @Override
    public String getGenericC() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        this.printListTExtendForC(list);
        return "ok";
    }
    //这个方法用到T参数，同时声明这是一个T类型的泛型方法，所以他在被调用时可以确定T为某一种具体的类型
    //这里为了和类的T冲突感觉应该设为其他类型比较好
    private <T> void printListTExtendForC(List<T> list){
        System.out.println(list);
    }


    @Override
    public String getGenericD() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        this.printListTExtendForD(list);
        return "ok";
    }
    //泛型通配符无需在方法前面声明
    //当他被调用时确定其具体类型, 这时和T没有任何区别
    private void printListTExtendForD(List<?> list){
        System.out.println(list);
    }


    /**
     * PECS原则
     * 频繁取内容，适合用 <? extends T>
     * 频繁存内容，适合用 <? super T>
     *
     */
    @Override
    public String getGenericE() {
        List<? extends Number> list = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        //由于不确定是不是Integer而赋值失败
//        list.addAll(integerList); // error
        Number number = list.get(0);//取值正确


        List<? super Integer> list1 = new ArrayList<>();
        list1.add(1);//赋值正确
//        Integer i = list1.get(0);//取值失败

        //当右边的泛型不确定（是不是真的string）时，左边给？
        List<?> list2 = new ArrayList<String>();
//        list2.add("111");//error
        return "ok";
    }
    //泛型通配符无需在方法前面声明
    //当他被调用时确定其具体类型, 这时和T没有任何区别
    private void printListTExtendForE(List<? extends Number> list){
        System.out.println(list);
    }






    public  static void printListWildCardExtend(List<? extends Number> list){
        for(Number e: list){
            System.out.print(e.doubleValue() + " ");
        }
        System.out.println("");
    }












    public static void main(String[] args) {
//        Number[] nums = new Integer[10];
//        nums[1] = 100;
//        System.out.println(Arrays.toString(nums));


        List<Integer> integers = Arrays.asList(1,2,3);
        printListWildCardExtend(integers);

        List<Double> doubles = new ArrayList<>();
        printListWildCardExtend(doubles);

//
//
//        List<? super Number> list = new ArrayList<>();
//        list.add(null);
//        List<? extends Number> numberList = new ArrayList<>();
//        numberList.add(1);
//        numberList.add(1L);
//        numberList.add(0.1);


        System.out.println(Integer.toBinaryString(5));;

    }
}
