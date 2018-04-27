package com.springdemo.springmvc.model;


import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Person {

    @NotEmpty(message="Name can not be empty")
    private String name;

    @NotEmpty(message = "Age cannot be empty")
    @Range(min = 0l, message = "Age must be positive number")
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
