/*Rainbow class: rainbow class contains the drawable piece that has no interaction with the player but exists on the board.
 * 
 * 
 * Authors: Justin Pajela and Brody Perlick
 * Date:February 4, 2024
 * Collaborators: None
 * Outside Sources: None
 */
package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Rainbow extends GamePiece{

	public Rainbow(int location) {
		super('R', "Rainbow", location);
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		return InteractionResult.NONE;
	}


}
