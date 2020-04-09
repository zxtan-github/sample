package org.tanzongxi.sample.module.base.annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@MyAnnotation
public class RuntimeAnnotationTest {
    public static void main(String[] args) {
        Annotation[] annotations =  RuntimeAnnotationTest.class.getAnnotations();
        Arrays.asList(annotations).stream().forEach(an -> System.out.printf(an.toString()));
    }
}
