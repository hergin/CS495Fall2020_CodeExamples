public class MainForCanvas {

    public static void main(String[] args) {
        Canvas mainCanvas = new Canvas();

        mainCanvas.addNewObject(new MovableCircle(10, 20, 3, 4, 10));
        mainCanvas.addNewObject(new MovablePoint(1, 4, 5, 6));
        mainCanvas.addNewObject(new MovablePoint(3, 5, 6, 1));

        mainCanvas.moveAllObjectsUp();
    }

}

