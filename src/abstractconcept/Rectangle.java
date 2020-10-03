package abstractconcept;

public class Rectangle extends Shape {
    private int length;
    private int width;

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "This is a rectangle with w: " + width
                + " l: " + length;
    }
}

