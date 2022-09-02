package com.fundamentos.sprigboot.fundamentos.bean;

public class MyBeanImpl implements MyBean{

    @Override
    public void print() {
        System.out.println("Hola desde mi propia dependencia");
    }
}
