package com.itwd.learnproject.designmode.creatormode.singleton;

/**
 * @Author: wangdong
 * @Date: 2021/2/19 15:11
 * @Version 1.0
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
    }
}

/**
 * 饿汉式
 */
class Singleton1{
    private final static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        return instance;
    }
}

/**
 * 饿汉式 静态代码块
 */
class Singleton2{
    private static Singleton2 instance;

    private Singleton2() {
    }

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}

/**
 * 懒汉式 线程不安全
 */
class Singleton3{
    private Singleton3() {
    }
    private static Singleton3 instance;
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}

/**
 * 懒汉式 同步方法
 */
class Singleton4{
    private Singleton4() {
    }
    private static Singleton4 instance;
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}

/**
 * 懒汉式 静态代码块 不能用
 */
class Singleton5{

}

/**
 * 双重检查
 */
class Singleton6{
    private Singleton6() {
    }
    private static volatile Singleton6 instance;
    public static Singleton6 getInstance(){
        if(instance == null){
            synchronized(Singleton6.class){
                if(instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}

/**
 * 静态内部类
 */
class Singleton7{
    private Singleton7(){
    }
    private static class SingletonInstance{
        private static Singleton7 instance = new Singleton7();
    }
    public static Singleton7 getInstance(){
        return  SingletonInstance.instance;
    }
}

/**
 * 枚举
 */
enum Singleton8{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}