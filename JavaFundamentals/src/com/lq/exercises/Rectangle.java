package com.lq.exercises;

public class Rectangle extends Shape implements TwoDimensional {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this(length, width, "Unknown", "White");
    }

    public Rectangle(double length, double width, String name, String color) {
        setLength(length);
        setWidth(width);
        super.setName(name);
        super.setColor(color);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Rectangle [length=");
        builder.append(getLength());
        builder.append(", width=");
        builder.append(getWidth());
        builder.append(", color=");
        builder.append(getColor());
        builder.append(", name=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }

}
