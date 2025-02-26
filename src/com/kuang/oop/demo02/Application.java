package com.kuang.oop.demo02;

/*
 ClassName: Application
 Description: 
 @Author zzzxinnix
 @Create 2025/2/26 14:30 
 @Version 1.0   
*/
public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();

        //s1.name; 修饰词private过后 再调用这个类的属性就无法调用

        //Student 类中定义了一些可以操作这些属性的方法后就可以调用了

        s1.setName("张三");
        String name = s1.getName();
        System.out.println(name);

        s1.setAge(16);
        System.out.println(s1.getAge());

    }


}
