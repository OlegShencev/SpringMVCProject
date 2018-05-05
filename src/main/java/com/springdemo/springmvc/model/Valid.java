package com.springdemo.springmvc.model;

import javax.validation.GroupSequence;

@GroupSequence({Valid.FirstStep.class, Valid.SecondStep.class})
public interface Valid {
    public interface FirstStep { }
    public interface SecondStep { }

}
