package com.jab.streams.exceptions;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.jab.streams.exceptions.LambdaExceptionUtil.rethrowFunction;

//http://stackoverflow.com/questions/27644361/how-can-i-throw-checked-exceptions-from-inside-java-8-streams
public @Slf4j class Example13 {

    /*
    public List<Class> getClasses() throws ClassNotFoundException {

        List<Class> classes =
                Stream.of("java.lang.Object", "java.lang.Integer", "java.lang.String")
                        .map(className -> Class.forName(className))
                        .collect(Collectors.toList());

        return classes;
    }
    */

    public static List<Class> getClasses() throws ClassNotFoundException {

        List<Class> classes =
                Stream.of("java.lang.Object", "java.lang.Integer", "java.lang.String")
                        .map(rethrowFunction(Class::forName))
                        .collect(Collectors.toList());

        return classes;
    }

    public static void main(String args[]) throws ClassNotFoundException {

        List<Class> list = getClasses();
        for(Class obj : list){
            log.info(obj.getName());
        }

    }
}
