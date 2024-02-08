package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.Giant;
import levelPieces.Leprechaun;
import levelPieces.PotOfGold;
import levelPieces.Witch;

class TestInteractionsTest {

	//@Test
	/*void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testGiant() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Giant giant = new Giant(9);
		gameBoard[9] = giant;
		//kills player on same space
		assertEquals(InteractionResult.KILL, giant.interact(gameBoard, 9));
		for (int i=0; i<9; i++)
			assertEquals(InteractionResult.NONE, giant.interact(gameBoard, i));
		for (int i=10; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, giant.interact(gameBoard, i));
	}
	
	@Test
	public void testLeprechaun() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Leprechaun leprechaun = new Leprechaun(9);
		gameBoard[9] = leprechaun;
		//kills player on same space
		assertEquals(InteractionResult.ADVANCE, leprechaun.interact(gameBoard, 9));
		for (int i=0; i<9; i++)
			assertEquals(InteractionResult.NONE, leprechaun.interact(gameBoard, i));
		for (int i=10; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, leprechaun.interact(gameBoard, i));		
	}
	
	@Test
	public void testWitch() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		Witch witch = new Witch(9);
		gameBoard[9] = witch;
		assertEquals(InteractionResult.HIT, witch.interact(gameBoard, 9));
		assertEquals(InteractionResult.HIT, witch.interact(gameBoard, 8));
		assertEquals(InteractionResult.HIT, witch.interact(gameBoard, 7));
		assertEquals(InteractionResult.HIT, witch.interact(gameBoard, 10));
		assertEquals(InteractionResult.HIT, witch.interact(gameBoard,11));
		
		for (int i=0; i<7; i++)
			assertEquals(InteractionResult.NONE, witch.interact(gameBoard, i));
		for (int i=12; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, witch.interact(gameBoard, i));		
	}
	@Test
	public void testPotOfGold() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		PotOfGold potOfGold = new PotOfGold(9);
		gameBoard[9] = potOfGold;
		//kills player on same space
		assertEquals(InteractionResult.GET_POINT, potOfGold.interact(gameBoard, 9));
		for (int i=0; i<9; i++)
			assertEquals(InteractionResult.NONE, potOfGold.interact(gameBoard, i));
		for (int i=10; i<GameEngine.BOARD_SIZE; i++)	
			assertEquals(InteractionResult.NONE, potOfGold.interact(gameBoard, i));		
	}
	

}
