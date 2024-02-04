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
