public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "This is a point with x: " + x + " y: " + y;
    }

    @Override
    public void moveUp() {
        this.x += this.xSpeed;
    }

    @Override
    public void moveDown() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveRight() {
        this.y += this.ySpeed;
    }
}


