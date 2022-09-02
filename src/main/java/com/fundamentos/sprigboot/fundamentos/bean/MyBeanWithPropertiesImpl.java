package com.fundamentos.sprigboot.fundamentos.bean;

public class MyBeanWithPropertiesImpl implements MyBeanWithProperties{

    private String name;
    private String random;

    public MyBeanWithPropertiesImpl(String name, String random) {
        this.name = name;
        this.random = random;
    }

    @Override
    public String funtion() {
        return name + " "+ random;
    }
}
