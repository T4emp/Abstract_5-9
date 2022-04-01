package com.xwx;

public class TestCircle {
    public static void main() {
        System.out.println("Test Circle");
        Circle c1 = new Circle(6.0);
        System.out.println(c1.radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}