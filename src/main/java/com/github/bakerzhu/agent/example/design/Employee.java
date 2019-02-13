package com.github.bakerzhu.agent.example.design;

/**
 * @Description
 * @auther bozhu
 * 访问者模式的元素会接受一个访问者的参数
 */
public interface Employee {
    public void accept(Department department);
}
