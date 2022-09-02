package com.fundamentos.sprigboot.fundamentos.bean;

public class MyBeanWithDependencyImpl implements MyBeanWithDependecy{

    private MyOperation myOperation;

    public MyBeanWithDependencyImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        myOperation.sum(myOperation.sum(numero));
        System.out.println("Hola desde la implementacion de un Bean con dependencia");
    }
}
