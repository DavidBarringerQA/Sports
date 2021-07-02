package com.qa.sports;

public class Tennis extends IndividualSports {
	private int game;
	private int score;
	
	public Tennis(int participants,int game,int score,String description) {
		super("tennis", participants,description);
		this.game = game;
		this.score = score;
	}
	
	public void point(String playerName) {
		System.out.println(playerName + " gets a point");	
	}
	public void rest(String playerName) {
		System.out.println(playerName + " is resting");
	}
	
	public int getGame() {
		return game;
	}
	
	public void setGame(int game) {
		this.game = game;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setTimeOut(int score) {
		this.score = score;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int stop() {
		// TODO Auto-generated method stub
		return 0;
	}
   

}
