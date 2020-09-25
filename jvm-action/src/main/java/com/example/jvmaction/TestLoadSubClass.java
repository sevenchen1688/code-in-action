package com.example.jvmaction;

public class TestLoadSubClass {
    public static void main(String[] args) {
        System.out.println(B.value);
        A[] arr = new A[10];
        System.out.println(A.DESC);
    }
}

class A {
    static {
        System.out.println("init A ...");
    }
    static int value = 100;
  	static final String DESC = "test";
}

class B extends A {
    static {
        System.out.println("init B ...");
    }
}