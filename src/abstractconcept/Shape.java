package abstractconcept;

public abstract class Shape {
    private String color;

    public abstract double getArea();

    public String toString() {
        return "This is a shape with color: " + color;
    }
}

