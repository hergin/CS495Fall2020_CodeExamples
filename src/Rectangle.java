import java.awt.*;

public class Rectangle {
    protected Point topLeft;
    private int length;
    private int width;

    public int getArea() {
        return length * width;
    }
}
