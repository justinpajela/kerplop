package levelPieces;
import java.lang.Math;
import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Giant extends GamePiece implements Moveable{
	private char symbol = 'G';
	private int location;
	private int turn = 0;
	private String label;
	public Giant(int location) {
	    super('G', "Giant", location);
	}

	public void draw() {
		System.out.print(symbol);
	}

	/**
	 * 
	 * Abstract classes should have at least one abstract method
	 * 
	 * @param gameBoard
	 * @param playerLocation
	 * @return
	 */
	public InteractionResult interact(Drawable [] gameBoard, int playerLocation) {
		if (Math.abs(this.getLocation() - playerLocation) < 2) {
			return InteractionResult.KILL;
		}
		return InteractionResult.NONE;
	}
	/**
	 * 
	 * @return piece's current location on board
	 */
	public int getLocation() {
		return location;
	}
	public void move(Drawable[] gameBoard, int playerLocation) {
		
	}
	
	
	/**
	 * @param newLocation - location to place piece
	 */
	public void setLocation(int newLocation) {
		// Ensure the location remains on the board
		if (newLocation >= 0 && newLocation < GameEngine.BOARD_SIZE)
			location = newLocation;
	}
	
	@Override
	public String toString() {
		return symbol + " - " + label ; 
	}
	private int updateGiantLocation() {
		int giantLocation = location;
		if (turn % 2 == 0 ) {
			if (giantLocation > 0) {
				giantLocation = location - 2;
			}
			else if(location < GameEngine.BOARD_SIZE - 1) { 
				giantLocation = location + 2; 
			}
		}
		return giantLocation;
	}
}
