package mazegame;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    private final List<Room> rooms = new ArrayList<>();

    public void createMaze() {
        Room room1 = makeRoom();
        Room room2 = makeRoom();
        room1.connect(room2);
        rooms.add(room1);
        rooms.add(room2);
    }

    abstract protected Room makeRoom();
}
