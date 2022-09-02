package com.fundamentos.sprigboot.fundamentos.bean;

public class MyBean2Impl implements MyBean{

    @Override
    public void print() {
        System.out.println("Hola desde mi 2 propia dependencia");
    }
}
