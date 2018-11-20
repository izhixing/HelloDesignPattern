package com.cyl.hello.designpattern.mediator;

public class SingletonSchool extends School {

    public SingletonSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    @Override
    public String getName() {
        return "单例宗";
    }
}
