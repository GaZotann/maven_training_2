package fr.lernejo.tester.internal;


import fr.lernejo.tester.api.TestMethod;

import javax.swing.*;
import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.util.*;

public class TestClassDescription {
    private Class<?> aclass;
    public TestClassDescription(Class<?> aclass){
        this.aclass = aclass;
    }
    public List<Method> listTestMethods(){
        List<Method> methods = new ArrayList<>();
        //Method method;
        for(final Method method : aclass.getDeclaredMethods()){
            if(!method.getReturnType().equals(void.class)){
                continue;
            }
            if(!method.isAnnotationPresent(TestMethod.class)){
                continue;
            }
            if (!Modifier.isPublic(method.getModifiers())){
                continue;
            }
            if(method.getParameterCount() > 0){
                continue;
            }
            methods.add(method);
        }
        return methods;
    }
}
