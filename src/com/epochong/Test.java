package com.epochong;

import java.lang.reflect.Field;

/**
 * @author epochong
 * @date 2019/8/13 23:19
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.epochong.Student");
        {
            Field[] fields = cls.getFields();
            for (Field field :
                    fields) {
                System.out.println(field);
            }
          /*  Field studentSchool = cls.getField("school");
            System.out.println(studentSchool);*/
        }
        System.out.println("-------------------------------------------");
        {
            Field[] fields = cls.getDeclaredFields();
            for (Field field :
                    fields) {
                System.out.println(field);
            }
            Field personId = cls.getDeclaredField("school");
            //personId.setAccessible(true);
            System.out.println(personId);
        }
    }
}
