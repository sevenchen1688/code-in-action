package com.example.jvmaction;

/**
 * @ClassName Test
 * @Description TODO
 * @Author chenzl
 * @Date 2020/9/18 16:05
 */
public class Test {
    private int m;

    public int getM() {
        System.out.println("相加：" + (m + 2));
        return m + 2;
    }

    public static void main(String[] args) {
        System.out.println("相加结果：" + (1+new Test().getM()));
    }
}
