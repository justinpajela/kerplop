/*PotOfGold class: contains the point interaction. Everytime
 * a player lands on a pot of gold they receive one point
 * 
 * Authors: Justin Pajela and Brody Perlick
 * Date:February 4, 2024
 * Collaborators: None
 * Outside Sources: None
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class PotOfGold extends GamePiece implements Moveable{

	public PotOfGold(int location) {
		super('X', "PotOfGold", location);
		
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if (playerLocation == getLocation()) {
			
			return InteractionResult.GET_POINT;
		}
		return InteractionResult.NONE;
	}
	
}
