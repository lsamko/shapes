package Shapes;

public class Parallelogram extends Shape {
    private double side;
    private double height;
    private Point x;

    public Parallelogram(Color color, double side, double height, Point x) {
        super(color);
        this.side = side;
        this.height = height;
        this.x = x;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public Point getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "side=" + side +
                ", height=" + height +
                ", color=" + getColor() +
                ", x=" + x +
                ", maxArea=" + getArea() +
                '}';
    }


    @Override
    public double getArea() {
        return side * height;
    }
}



