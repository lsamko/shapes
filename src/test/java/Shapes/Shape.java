package Shapes;

public abstract class Shape {


    protected double radius;


    public abstract double getArea();

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    protected double getRadius() {
        return radius;
    }

}

