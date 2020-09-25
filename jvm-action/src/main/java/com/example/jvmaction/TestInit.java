package com.example.jvmaction;

public class TestInit {

    static {
        DESC = "hello world!!!";
    }

    private static String DESC;

    public void test() {
        DESC = "a";
    }

    public static void main(String[] args) {
        System.out.println(DESC);
    }

}