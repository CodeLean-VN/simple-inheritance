package com.codelean;

public class TestShape {
    public static void main(String[] args) {

        //Test-case 1
        System.out.println("Test-case 1");
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        //Test-case 2
        System.out.println("Test-case 2");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        //Test-case 3
        System.out.println("Test-case 3");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        //Test-case 4
        Shape rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Shape rectangle2 = new Rectangle(23.5, 12, "red", true);
        System.out.println(rectangle2);

    }
}
