package org.example.sample;

public class SimpleClass {
    private int testInteger;

    public SimpleClass() {
        this.testInteger = 10;
    }

    public String hello() {
        return String.format("Hello World! number %d", this.testInteger);
    }

    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();
        System.out.println(simpleClass.hello());
    }
}


