package com.example.demo.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 内置四大核心函数式接口
 * Consumer<T>:消费型接口
 * void accept(T t);
 * <p>
 * Supplier<T>:供给型接口
 * T get();
 * <p>
 * Function<T,R>:函数式接口
 * R apply(T t);
 * <p>
 * Predicate<T>:断言型接口
 * boolean test(T t);
 */

public class TestFunction {

    //断言型接口
    @Test
    public void test4() {
        List<String> list = Arrays.asList("hello", "www", "lucy", "ok");
        List<String> filter = filterStr(list, str -> str.length() > 3);
        filter.forEach(str -> System.out.println(str));
    }

    //需求：将满足条件的字符串，放入集合
    public List<String> filterStr(List<String> list, Predicate<String> pre) {
        List<String> stringList = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str)) stringList.add(str);
        }
        return stringList;
    }


    //函数型接口
    @Test
    public void test3() {
        String str1 = getStr("  aa  bb  ", (str) -> str.trim());
        System.out.println(str1);

        String str2 = getStr(str1, (str) -> str.substring(0, 2));
        System.out.println(str2);
    }

    //处理字符串
    public String getStr(String str, Function<String, String> fun) {
        return fun.apply(str);
    }

    //供给型接口
    @Test
    public void test2() {
        List<Integer> nums = getNumList(10, () -> (int) (Math.random() * 100));
        nums.forEach(a -> System.out.println(a));
    }

    //产生指定个数的整数，并放入集合
    public List<Integer> getNumList(int num, Supplier<Integer> sup) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }

    //消费型接口
    @Test
    public void test1() {
        happy(1000, m -> System.out.println("花了1000元"));
    }

    public void happy(double money, Consumer<Double> con) {
        con.accept(money);
    }

}
