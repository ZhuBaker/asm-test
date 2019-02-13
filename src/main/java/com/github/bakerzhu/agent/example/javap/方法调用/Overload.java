package com.github.bakerzhu.agent.example.javap.方法调用;

import java.io.Serializable;

public class Overload {
    public static void sayHello(Object arg){
        System.out.println("hello object");
    }
    public static void sayHello(int arg){
        System.out.println("hello int");
    }
    public static void sayHello(long arg){
        System.out.println("hello long");
    }
    public static void sayHello(Character arg){
        System.out.println("hello object");
    }
    public static void sayHello(char arg){
        System.out.println("hello char");
    }
    public static void sayHello(char...arg){
        System.out.println("hello char...");
    }
    public static void sayHello(Serializable arg){
        System.out.println("hello serializable");
    }
    public static void main(String[] args) {
        sayHello('a');
    }

/**
 public static void main(java.lang.String[]);
 Code:
 0: bipush        97
 2: invokestatic  #10                 // Method sayHello:(C)V
 5: return
 */
}
