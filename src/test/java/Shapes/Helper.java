package Shapes;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.random;

public class Helper {

    public static void printArrayElements(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }


    public  static Shape findMaxArea(Shape[] shapes) {
        Shape maxShape = null;
        double max = Double.NEGATIVE_INFINITY;
        for (Shape shape : shapes) {

            double area = shape.getArea();
            if (area > max)
                max = area;
            maxShape = shape;
        }
        System.out.println("MaxArea: " + max + "\n");

        return maxShape;
    }

//    public static Shape[] addElToArray(Parallelogram parallelogram, Parallelogram[] shapes) {
//        int lenght = shapes.length;
//        Parallelogram[] newShape = Arrays.copyOf(shapes, lenght + 1);
//        newShape[lenght] = parallelogram;
//        return newShape;
//    }
    public static void addElToArray(Shape[] shapes) {
        Shape[]shapes1;
        int oldLenght = shapes.length;
        int newLenght = oldLenght + 5;
        try {

            shapes[5] = new Circle(Color.BLACK, 4, new Point(-1, 6));

            System.out.println(shapes[5]);
        } catch (ArrayIndexOutOfBoundsException ie) {

            System.err.println(ie.toString());

        } finally {
            shapes1 = Arrays.copyOf(shapes, newLenght);

        }

        System.out.println("New Element in Array_2: " + Arrays.toString(shapes1) + "\n");

    }


    public static void compareArrays(Shape[] shapes, Shape[] shapes1) {
        boolean b;

        shapes.equals(shapes1);
        if (shapes.length < shapes1.length) {
            b = true;
            System.out.println("True");
        } else {
            b = false;
            System.out.println("False");

        }
        System.out.println("Compare Array_1 and Array_2: " + b);
    }

    public static void randomShape(int amountTriangle, int amountCircle, int amountSquare) {
        //int random = (int) Math.random() * 25;

        ArrayList<Shape> list = new ArrayList<>();

        for (int i = 0; i < amountCircle; i++) {
            Circle shape = new Circle(Color.randomColor(), random(), new Point(random(), random()));
            list.add(shape);
        }
        for (int i = 0; i < amountTriangle; i++) {
            Triangle shape1 = new Triangle(Color.randomColor(), new Point(random(), random()),
                    new Point(random(), random()),
                    new Point(random(), random()));
            list.add(shape1);
        }
        for (int i = 0; i < amountSquare; i++) {
            Square shape2 = new Square(Color.randomColor(), random(), new Point(random(), random()));
            list.add(shape2);
        }
        for (Shape s : list)
            System.out.println("Array" + s);
    }

    public static Circle findMaxCircleRadius(Circle[] circles) {
        Circle maxCircle = null;
        double maxRadius = Double.NEGATIVE_INFINITY;

        for (Circle circle : circles) {
            double radius = circle.getRadius();
            if (radius > maxRadius) {
                maxRadius = radius;
                maxCircle = circle;
            }
        }
        System.out.println("Max radius of Circles is : " + maxRadius);
        return maxCircle;
    }


}









