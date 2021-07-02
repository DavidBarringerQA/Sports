package com.qa.sports;

public class Boxing extends IndividualSports{
	private int rounds;
	private int timeOut;
	
	public Boxing(int participants,int rounds,int timeOut,String description) {
		super("boxing", participants,description);
		this.rounds = rounds;
		this.timeOut = timeOut;
	}
	public void surrender(Boxing a) {
		System.out.println(a.getName() + " surrenders");
	}
	public void taunt(Boxing a) {
		System.out.println(a.getName() + " taunts opponent");
	}
	
	public int getRounds() {
		return rounds;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public int getTimeOut() {
		return timeOut;
	}
	
	public void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
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
