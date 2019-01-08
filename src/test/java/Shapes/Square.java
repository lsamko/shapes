package Shapes;

public class Square extends Shape implements Comparable<Shape> {
    private double side;
    private Point x2;

    public Square(Color color, double side, Point x2) {
        super(color);
        this.side = side;
        this.x2 = x2;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", x2=" + x2 +
                ", color=" + getColor() +
                ", Area=" + getArea() +
                '}';
    }


    @Override
    public double getArea() {
        return Math.sqrt(side);

    }

    @Override
    public int compareTo(Shape o) {

        int compareInt = this.getColor().compareTo(o.getColor());
        if (compareInt < 0) {
            return -1;
        } else if (compareInt > 0) {
                return 1;
            }
            return 0;
        }

    }



