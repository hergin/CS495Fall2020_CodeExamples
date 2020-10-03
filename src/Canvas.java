import java.util.ArrayList;
import java.util.List;

public class Canvas {
    List<Movable> allObjects;

    public Canvas() {
        this.allObjects = new ArrayList<>();
    }

    public List<Movable> getAllObjects() {
        return allObjects;
    }

    public void addNewObject(Movable aMovable) {
        this.allObjects.add(aMovable);
    }

    public void moveAllObjectsUp() {
        for (Movable aMovable : allObjects) {
            aMovable.moveUp();
        }
    }
}

