package levelPieces;
import gameEngine.Moveable;
import gameEngine.Player;

import java.util.ArrayList;

import gameEngine.Drawable;

public class LevelSetup {
	private Drawable[] board;
	private ArrayList<Moveable> moveablePieces;
	private ArrayList<GamePiece> interactivePieces;
	private int playerStartLocation=9;
	private Drawable Board[] = new Drawable[20];
	private Player player;
 	public LevelSetup( ) {
		moveablePieces = new ArrayList<>();
		interactivePieces = new ArrayList<>();
		player = new Player(playerStartLocation);
	}
	public void createLevel(int levelNum) {
		board = new Drawable[20];
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
		Giant giant = new Giant(5);
		PotOfGold pg = new PotOfGold(12); 
		PotOfGold pg2 = new PotOfGold(1); 
		board[giant.getLocation()] = giant;
		board[pg.getLocation()] = pg;
		board[pg2.getLocation()] = pg2;
		interactivePieces.add(pg);
		interactivePieces.add(pg2);
 		moveablePieces.add(giant);
		interactivePieces.add(giant);
	}
	
	public void levelTwo() {
		Giant giant = new Giant(5);
	}

}
