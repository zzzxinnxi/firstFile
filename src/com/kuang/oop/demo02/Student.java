package com.kuang.oop.demo02;

/*
 ClassName: Test01
 Description:

 封装：
 属性私有 get set

 快捷键: alt + insert 可以快速添加get和set属性方法

 @Author zzzxinnix
 @Create 2025/2/26 14:31 
 @Version 1.0   
*/

public class Student {
    //属性私有 get/set

    //姓名
    private String name;
    //学号
    private int id;
    //性别
    private char gender;
    //年龄
    private int age;

    //提供一些可以调用这些属性的方法
    public String getName(){
        return this.name;
    }

    public void setName(String name ){
        this.name = name;
    }

    //快捷键: alt + insert 可以快速添加get和set属性方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 150 || age < 0){
            System.out.println("您输入的年龄不合法！");
        }else{
            this.age = age;
        }
    }
}
