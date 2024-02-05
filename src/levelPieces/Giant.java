/*
 * 
 * Authors: Justin Pajela and Brody Perlick
 * Date:February 4, 2024
 * Collaborators: None
 * Outside Sources: None
 */
package levelPieces;
import java.lang.Math;
import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.Moveable;
import java.util.Random; 
public class Giant extends GamePiece implements Moveable{
	private int turn = 0;
	private boolean movingRight = true; 
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
	 public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
	        // Kills only if on the same location as the player
	        if (this.getLocation() == playerLocation) {
	            return InteractionResult.KILL;
	        }
	        return InteractionResult.NONE;
	    }

	    @Override
	    public void move(Drawable[] gameBoard, int playerLocation) {
	        turn++; 
	        if (turn % 2 == 0) {
	            if (movingRight && getLocation() == GameEngine.BOARD_SIZE - 2) { 
	                movingRight = false;
	            } else if (!movingRight && getLocation() == 0) {
	                movingRight = true;
	            }
	            int nextLocation = movingRight ? getLocation() + 1 : getLocation() - 1;
	            if ((nextLocation >= 0 && nextLocation < GameEngine.BOARD_SIZE) && gameBoard[nextLocation] == null) {
	                gameBoard[getLocation()] = null; 
	                setLocation(nextLocation); 
	                gameBoard[getLocation()] = this; 
	            }
	        }
	    }

}
