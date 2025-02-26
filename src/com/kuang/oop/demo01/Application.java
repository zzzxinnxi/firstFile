package com.kuang.oop.demo01;

/*
 ClassName: Application
 Description: 
 @Author zzzxinnix
 @Create 2025/2/25 18:01 
 @Version 1.0   
*/
public class Application {
    //正常的一个项目中只有一个main方法
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "张三";
        person1.age = 18;
        System.out.println(person1.name);
        System.out.println(person1.age);

        Person.eat();//通过 类名.方法 的形式调用了eat这个方法

        //如果是非静态类的方法，则无法通过上述方式调用方法
        // 只能先通过new进行实例化，先形成一个具体的对象，再进行调用
        // Person.study(); 会出现报错

        person1.study();//不会出现报错，因为person1是一个已经实例化的对象

    }
}
