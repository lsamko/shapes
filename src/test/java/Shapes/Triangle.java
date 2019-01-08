package Shapes;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;


    public Triangle(Color color, Point a, Point b, Point c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", color=" + getColor() +
                ", maxArea=" + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        double ar = (b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY());
        return (ar / 2);

    }


}




