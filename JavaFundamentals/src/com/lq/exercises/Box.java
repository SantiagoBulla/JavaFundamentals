package com.lq.exercises;

public class Box extends Shape implements ThreeDimensional {

    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length, String color, String name) {
        this.height = height <= 0 ? 1 : height;
        this.width = width <= 0 ? 1 : width;
        this.length = length <= 0 ? 1 : length;
        setColor(color);
        setName(name);
    }

    public Box(double value) {
        this(value, value, value, "White", "Unknown");
    }

    public Box() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be greater than 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than 0");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0");
        }

    }

    public double getVolume() {
        return (getHeight() * getWidth() * getLength());
    }

    public double getSurfaceArea() {
        return ((width * height + width * length + length * height) * 2);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Box [length=");
        builder.append(length);
        builder.append(", width=");
        builder.append(width);
        builder.append(", height=");
        builder.append(height);
        builder.append(", color=");
        builder.append(getColor());
        builder.append(", name=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }

    public void printBox() {
        if (getHeight() <= 0 || getWidth() <= 0 || getLength() <= 0) {
            System.out.println("The box contains invalid properties");
        } else {
            System.out.printf("Length = %.2f %nWidth = %.2f %nHeight = %.2f %nVolume = %.2f %nArea = %.2f %n",
                    getLength(),
                    getWidth(), getHeight(), getVolume(), getSurfaceArea());
        }
    }
}
