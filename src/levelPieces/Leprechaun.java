/*
 * 
 * Authors: Justin Pajela and Brody Perlick
 * Date:February 4, 2024
 * Collaborators: None
 * Outside Sources: None
 */package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Leprechaun extends GamePiece implements Moveable{
	// leprechaun jumps around the map
	private Boolean moveRight = true;
	
	public Leprechaun(int location) {
		super('L', "Leprechaun", location);
		
	}
	
	public void draw() {
		System.out.print(symbol);
	}
	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if (this.getLocation()==playerLocation) {
			return InteractionResult.ADVANCE;
		} else {
			return InteractionResult.NONE;
		}
		
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// can only be set to odd numbers in the level setup
		if (moveRight && getLocation() == 19) {
			moveRight = false;
		} else if (!moveRight && getLocation() == 1) {
			moveRight = true;
		}
		
		
		if ((moveRight) && (getLocation()+2 < 20) && (gameBoard[getLocation()+2] == null)) {
			gameBoard[getLocation()] = null;
			setLocation(getLocation()+2);
			gameBoard[getLocation()] = this;
		} else if ((!moveRight) && (getLocation()-2 > 0) && (gameBoard[getLocation()-2] == null)){
			gameBoard[getLocation()] = null;
			setLocation(getLocation()-1);
			gameBoard[getLocation()] = this;
		} else if((gameBoard[getLocation()+2] != null) &&  gameBoard[getLocation()+1] == null) {
			gameBoard[getLocation()] = null;
			setLocation(getLocation()+1);
			gameBoard[getLocation()] = this;
		} else if((gameBoard[getLocation()-2] != null) && gameBoard[getLocation()-1] == null) {
			gameBoard[getLocation()] = null;
			setLocation(getLocation()-2);
			gameBoard[getLocation()] = this;
		}
		
	}

}
