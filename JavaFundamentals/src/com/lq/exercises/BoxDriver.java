package com.lq.exercises;

public class BoxDriver {
        public static void main(String[] args) {
                Box box1 = new Box(7, 6, 5, "Box", "red");
                Box box2 = new Box(10);
                System.out.printf("For Box1: %nLength is is %.2f %nWidth is %.2f %nHeight %.2f %n", box1.getLength(),
                                box1.getWidth(),
                                box1.getHeight());
                System.out.printf("For Box2: %nLength is %.2f %nWidth is %.2f %nHeight %.2f %n", box2.getLength(),
                                box2.getWidth(),
                                box2.getHeight());

                System.out.println("---------------------------------");
                box1.setLength(3);
                box1.setWidth(4);
                box1.setHeight(5);
                System.out.printf("Length: %.2f, Width: %.2f, Height: %.2f", box1.getLength(), box1.getWidth(),
                                box1.getHeight());

                System.out.println("---------------------------------");
                box1.getVolume();
                box1.getSurfaceArea();

                System.out.println("----------------------------------");
                box1.printBox();
                box1.setLength(-5);
                box1.printBox();

                System.out.println("----------------------------------");
                Box box3 = new Box(7, -4, 0, "Box2", "blue");
                box3.printBox();
        }

}