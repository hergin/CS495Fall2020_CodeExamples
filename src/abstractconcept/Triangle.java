package abstractconcept;

public class Triangle extends Shape {
    private int base;
    private int height;

    @Override
    public double getArea() {
        return base * height / 2.0;
    }

    @Override
    public String toString() {
        return "This is a triangle with b: " + base
                + " h: " + height;
    }
}

