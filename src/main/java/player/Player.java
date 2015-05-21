package player;

import game.GameHandler;

public abstract  class Player{
	
	public static  char lastChar;
	public GameHandler gameHandler;	


	public abstract void makeMove() ;

	public Player() {
		gameHandler= new GameHandler();
	}


}
