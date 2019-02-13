package com.github.bakerzhu.agent.example.design;

/**
 * @auther bozhu
 * @Description 抽象的访问者类提供了两个访问具体元素的抽象方法，然后我们具体的实现元素类和访问者类。
 */
public abstract class Department {

    public abstract void visit(FulltimeEmployee employee);

    public abstract void visit(ParttimeEmployee employee);

}