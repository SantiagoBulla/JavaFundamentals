package com.lq.exercises;

public class Cube extends Box {

    public Cube(double side) {
        super(side);
    }

    @Override
    public void setHeight(double height) {
        if (height != super.getHeight()) {
            setSide(height);
        }
    }

    @Override
    public void setLength(double length) {
        if (length != super.getLength()) {
            setSide(length);
        }
    }

    @Override
    public void setWidth(double width) {
        if (width != super.getWidth()) {
            setSide(width);
        }
    }

    public void setSide(double value) {
        if (value <= 0) {
            System.err.println("Length must be greater than 0");
        } else {
            super.setHeight(value);
            super.setLength(value);
            super.setWidth(value);
        }
    }

    public double getSide() {
        return getWidth();
    }

}
