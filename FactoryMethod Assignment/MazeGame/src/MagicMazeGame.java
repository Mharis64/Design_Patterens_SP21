import java.util.ArrayList;
import java.util.List;
import mazegame.MagicRoom;
import mazegame.MazeGame;

public class MagicMazeGame extends MazeGame {
    @Override
    protected MagicRoom makeRoom() {
        return new MagicRoom();
    }

    public static void main(String[] args) {
        MagicMazeGame magicGame = new MagicMazeGame();
        magicGame.createMaze();
    }
}
