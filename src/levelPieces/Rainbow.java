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
