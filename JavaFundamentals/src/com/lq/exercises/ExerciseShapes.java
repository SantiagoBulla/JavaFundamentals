package com.lq.exercises;

public class ExerciseShapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[8];

        Rectangle rectangle1 = new Rectangle(10, 15);
        Rectangle rectangle2 = new Rectangle(2, 6, "Rectangulo", "Blue-clarito");
        shapes[0] = rectangle1;
        shapes[1] = rectangle2;

        Square square1 = new Square(25);
        Square square2 = new Square(8);
        shapes[2] = square1;
        shapes[3] = square2;

        Cube cube1 = new Cube(18);
        Cube cube2 = new Cube(48);
        shapes[4] = cube1;
        shapes[5] = cube2;

        Box box1 = new Box(8);
        Box box2 = new Box(16);
        shapes[6] = box1;
        shapes[7] = box2;

        // List<Shape> shapes2 = Arrays.asList(shapes);
        // shapes2.forEach(shape -> shape.setColor("Color"));
        // for (Shape shape : shapes2) {
        // ThreeDimensional temp = (ThreeDimensional)shape;
        // System.out.println(temp.getVolume());
        // }

        TwoDimensional[] twoDs = new TwoDimensional[3];
        Circle circle1 = new Circle(4);
        twoDs[0] = circle1;
        twoDs[1] = rectangle1;
        twoDs[2] = square1;
        for (TwoDimensional figure : twoDs) {
            System.out.println(figure.getArea());
            System.out.println(figure.getPerimeter());
        }

    }
}
