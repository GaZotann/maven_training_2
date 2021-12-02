package fr.lernejo.tester.internal;

import fr.lernejo.tester.SomeLernejoTests;
import fr.lernejo.tester.api.TestMethod;
import jdk.incubator.vector.VectorOperators;

import java.lang.reflect.Method;
import java.util.List;

public class TestClassDescriptionLernejoTests {

    void main(String args[]){
        test();
    }

    @TestMethod
    void test(){
        Class<SomeLernejoTests> testClass = SomeLernejoTests.class;
        TestClassDescription testClassDescription = new TestClassDescription(testClass);
        List<Method> methode = testClassDescription.listTestMethods();
        System.out.println(methode);
    }
}
