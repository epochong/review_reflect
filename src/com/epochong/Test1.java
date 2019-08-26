package com.epochong;

import java.lang.reflect.Field;

/**
 * @author epochong
 * @date 2019/8/13 23:57
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> cls = Class.forName("com.epochong.Person");
        Object obj = cls.newInstance();
        Field idField = cls.getDeclaredField("id");
        System.out.println(idField.getType());
        System.out.println(idField.getType().getName());
        System.out.println(idField.getType().getSimpleName());

    }
}
