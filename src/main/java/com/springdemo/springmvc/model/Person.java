package com.springdemo.springmvc.model;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


public class Person {

    @NotEmpty(message="Name can not be empty", groups=Valid.FirstStep.class)
    private String name;

    @Min(value = 1,message = "Select correct age", groups=Valid.SecondStep.class)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
