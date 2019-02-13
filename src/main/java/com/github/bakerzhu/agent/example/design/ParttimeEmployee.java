package com.github.bakerzhu.agent.example.design;

/**
 * @Description
 * @auther bozhu
 */
public class ParttimeEmployee implements Employee{
    private String name;
    private String salary;

    public ParttimeEmployee(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }

    public String getName() {
        return this.name;
    }
}
