package com.example.demo.dynamicProxy;

public class RealSubject implements Subject{


    @Override
    public String sayHello(String content) {
        return "hello~ xxx , "+content;
    }

    @Override
    public String sayBye(String content) {
        return "Bye~ xxx , "+content;
    }
}