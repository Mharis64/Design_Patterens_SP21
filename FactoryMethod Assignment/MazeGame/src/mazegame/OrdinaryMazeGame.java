/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mazegame;

/**
 *
 * @author MUHAMMAD
 */
public class OrdinaryMazeGame extends MazeGame {
    @Override
    protected OrdinaryRoom makeRoom() {
        return new OrdinaryRoom();
    }

    public static void main(String[] args) {
        OrdinaryMazeGame ordinaryGame = new OrdinaryMazeGame();
        ordinaryGame.createMaze();
    }

    private void createMaze() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class OrdinaryRoom {

        public OrdinaryRoom() {
        }
    }
}
