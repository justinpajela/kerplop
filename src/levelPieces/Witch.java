/*Witch class contains interaction result and movement for the witch on the board
 * 
 * Authors: Justin Pajela and Brody Perlick
 * Date:February 4, 2024
 * Collaborators: None
 * Outside Sources: None
 */
package levelPieces;
import java.util.Random;
import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Witch extends GamePiece implements Moveable{
	
	//distance of two away and is a hit
	//doesn't matter if objects are in sight
	
	
	public Witch(int location) {
		super('W', "Witch", location);		
	}
	
	

	public void draw() {
		System.out.print(symbol);
	}
	
	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		int spellZone = Math.abs(playerLocation - getLocation());
		if (spellZone < 3){
			return InteractionResult.HIT;	// hits in range of 2
		} else {
			return InteractionResult.NONE;
		}
		
	}
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		Random rand = new Random();
		int teleport = rand.nextInt(20);
		
		if (teleport < 19 && gameBoard[teleport] == null) {
			gameBoard[getLocation()] = null;				// reset the board spot
			setLocation(teleport);							
			gameBoard[getLocation()] = this;				//new location
		}
	}
}
