package com.lq.exercises;

public class ExercisePrint {
    public static void main(String[] args) {
        Shape[] myArray = new Shape[4];
        myArray[0] = new Rectangle(20, 15, "Rectangle", "Blue");
        myArray[1] = new Cube(85);
        myArray[2] = new Box(4, 6, 8, "Box", "Green");
        myArray[3] = new Circle(12, "Yellow", "Circle");

        for (Shape shape : myArray) {
            System.out.println(shape.toString());
        }
    }

}
