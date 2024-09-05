package com.lq.exercises;

public class Circle extends Shape implements TwoDimensional {
    private double radius;

    public Circle(double radius) {
        this(radius, "White", "Unknown");
    }

    public Circle(double radius, String color, String name) {
        setRadius(radius);
        setColor(color);
        setName(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.sqrt(getRadius());
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Circle [radius=");
        builder.append(getRadius());
        builder.append(", color=");
        builder.append(getColor());
        builder.append(", name=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }

}
