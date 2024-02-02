package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

public class Giant implements Drawable{
	private char symbol = 'G';
	private int location;
	private int turn = 0;
	public Giant(int location) {
		this.location = location;
	}
	public void draw() {
		System.out.print(symbol);
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
public abstract InteractionResult interact(Drawable [] gameBoard, int playerLocation);
}
