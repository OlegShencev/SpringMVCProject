package com.springdemo.springmvc.model;


import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Person {

    @NotEmpty(message="name cannot be empty")
    private String name;

    @NotEmpty(message = "Age can not be empty")
    @Range(min = 0l, message = "Please select positive numbers Only")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
