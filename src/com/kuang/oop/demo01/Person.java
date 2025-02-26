package com.kuang.oop.demo01;

/*
 ClassName: Person
 Description: 
 @Author zzzxinnix
 @Create 2025/2/25 18:02 
 @Version 1.0   
*/
//创建一个类
//类是抽象的，而对象则是一个实体

//遵循一句话：用类去构建代码 用对象来封装数据

//类中无非包含两种东西：①属性：静态的字段 ②方法：动态的行为
public class Person {

    //定义属性字段：
    String name;
    int age;

    //定义方法字段：修饰词 返回值类型 方法名（）
    //方法分为两种定义方式：
    //① 带static修饰词的静态的方法定义：static定义的方法和类一起加载了
    // 可以直接以 类名.方法 的形式使用这个方法

    public static void eat(){
        System.out.println("这个人在吃饭。");
    }

    //② 不带static修饰词的静态的方法定义：而非static定义的方法需要实例化后才可以调用
    public void study(){
        System.out.println("这个人在学习。");
    }

}
