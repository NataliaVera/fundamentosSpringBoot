package com.fundamentos.sprigboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImpl implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola desde mi componente 2");
    }
}
