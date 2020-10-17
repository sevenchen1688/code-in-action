package com.example.jvmaction;

/**
 * @ClassName Test
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/18 16:05
 */
public class Test {
    public static void main(String[] args) {
        new Test().a();
    }

    private void a() {
        b();
    }

    private void b() {
        a();
    }
}
