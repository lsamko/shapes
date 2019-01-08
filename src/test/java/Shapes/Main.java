package Shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static Shapes.Helper.addElToArray;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(Color.GRAY, 5.02, new Point(15, 5));
        Circle circle1 = new Circle(Color.YELLOW, 15.2, new Point(8, 2));
        Circle circle2 = new Circle(Color.WHITE, 8.082, new Point(4, -5));
        Circle circle3 = new Circle(Color.BLACK, 3.16, new Point(1, 2));
        Circle circle4 = new Circle(Color.RED, 0.72, new Point(7, 3));


        Triangle triangle = new Triangle(Color.BLUE, new Point(7, 11), new Point(-14, 2),
                new Point(6, -9));
        Square square = new Square(Color.WHITE, 20, new Point(-3, 13));
        Square square1 = new Square(Color.BLACK, 3.5, new Point(5, 8));
        Square square2 = new Square(Color.PURPLE, 8.04, new Point(-9, 11));
        Square square3 = new Square(Color.BLACK, 14, new Point(-4, 13));
        Square square4 = new Square(Color.WHITE, 58, new Point(3, 10));
        Square square5 = new Square(Color.YELLOW, 6.9, new Point(10, 13));


//        Shape[] shapes = {circle, triangle, square};
        Parallelogram parallelogram = new Parallelogram(Color.BLACK, 19, 47, new Point(3, -4));
//        shapes = (Shape[]) addElToArray(parallelogram, (Parallelogram[]) shapes);
//        System.out.println(Arrays.toString(shapes));


        Shape[] shapes = {circle, triangle, square};
        Shape[] shapes1 = {circle, triangle, square, parallelogram};

        System.out.println("Array_1: ");

        Helper.printArrayElements(shapes);

        Helper.findMaxArea(shapes);

        Helper.addElToArray(shapes1);

        Helper.compareArrays(shapes, shapes1);

        Helper.randomShape(5, 7, 4);

        System.out.println();

        Circle[] circles = {circle, circle1, circle2, circle3, circle4};
        Arrays.sort(circles);
        for (Circle circle5 : circles) {
            System.out.println("Circles with sorting by Radius: " + circle5);
        }
        Helper.findMaxCircleRadius(circles);

        List<Square> list = new ArrayList<>();
        list.add(square);
        list.add(square1);
        list.add(square2);
        list.add(square3);
        list.add(square4);
        list.add(square5);
        Collections.sort(list);

        for (Square square7 : list) {
            System.out.println("Squares with sorting by Color: " + square7);
        }


    }
}







