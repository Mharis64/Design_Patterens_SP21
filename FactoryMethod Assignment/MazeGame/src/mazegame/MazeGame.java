/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mazegame;

/**
 *
 * @author MUHAMMAD
 */
import java.util.ArrayList;
import java.util.List;

public abstract class MazeGame {
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

