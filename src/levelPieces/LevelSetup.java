package levelPieces;
import gameEngine.Moveable;
import gameEngine.Player;

import java.util.ArrayList;

import gameEngine.Drawable;

public class LevelSetup {
	private Drawable[] board;
	private ArrayList<Moveable> moveablePieces;
	private ArrayList<GamePiece> interactivePieces;
	private int playerStartLocation;
	private Drawable Board[] = new Drawable[20];
 	public LevelSetup( ) {
		moveablePieces = new ArrayList<>();
		interactivePieces = new ArrayList<>();
	}
	public void createLevel(int levelNum) {
		board = new Drawable[21];
		moveablePieces.clear();
		interactivePieces.clear();
		if (levelNum == 1) {
			levelOne();
		}
		if (levelNum == 2) {
			levelTwo();
		}
	}
	public void setBoard(Drawable[] board) {
		Board = board;
	}
	public Drawable[] getBoard() {
		
		return board;
	}

	public ArrayList<Moveable> getMovingPieces() {//need giant, witch/wizard/ leprechaun 
		return moveablePieces;
	}

	public ArrayList<GamePiece> getInteractingPieces() { // need giant, witch/wizard, pot of gold, leprechaun
		return interactivePieces;
	}
	public void setInteractivePieces(ArrayList<GamePiece> interactivePieces ) {
		this.interactivePieces = interactivePieces;
	}
	public void setMoveablePieces(ArrayList<Moveable> moveablePieces) {
		this.moveablePieces = moveablePieces;
	}

	public int getPlayerStartLoc() {
		
		return playerStartLocation;
	}
	public void levelOne() {
		Player player = new Player(17);
		Giant giant = new Giant(2);
		board[player.getLocation()] = player;
		board[giant.getLocation()] = giant;
		moveablePieces.add(giant);
		
	}
	public void levelTwo() {
		Giant giant = new Giant(5);
	}

}
