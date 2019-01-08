package Shapes;

public class Circle extends Shape implements Comparable<Shape> {
    private double radius;
    private Point x1;

    public void setX1(Point x1) {
        this.x1 = x1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Color color, double radius, Point x1) {
        super(color);
        this.radius = radius;
        this.x1 = x1;
    }

    public double getRadius() {
        return radius;
    }

    public Point getX1() {
        return x1;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", color=" + getColor() +
                ", x1=" + x1 +
                ", Area=" + getArea() +
                '}';
    }


    @Override
    public double getArea() {
        return Math.PI * radius*radius;
    }

    @Override
    public int compareTo(Shape o) {
        if (this.getRadius() > o.getRadius()) {
            return 1;
        } else if (this.getRadius() < o.getRadius()) {
            return -1;
        }
        return 0;
    }

}


