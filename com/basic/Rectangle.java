package com.basic;

import com.sun.prism.impl.shape.ShapeRasterizer;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle : draw() method");
    }
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square : draw() method");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle : draw() method");
    }
}
