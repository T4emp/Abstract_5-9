package com.xwx;

public class TestResizableCircle {
    public static void main() {
        System.out.println("Test Resizable Circle");
        ResizableCircle t1 = new ResizableCircle(12.0);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getArea());
        System.out.println(t1.resize(75));
    }
}