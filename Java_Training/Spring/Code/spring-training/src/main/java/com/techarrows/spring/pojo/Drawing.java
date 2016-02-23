package com.techarrows.spring.pojo;

public class Drawing {
    private Shape shape;

    public void drawShape() {
        System.out.println("Drawing shape -- START");
        shape.draw();
        System.out.println("Drawing shape -- END");
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
