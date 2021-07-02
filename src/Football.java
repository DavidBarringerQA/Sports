
public class Football extends TeamSport implements IPlay {
	
	private String teamOne;
	private String teamTwo;
	private String referee;
	

	public Football(String name, int players, String type, int teamPlayers, String teamOne, String teamTwo,
			String referee) {
		super(name, players, type, teamPlayers);
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.referee = referee;
	}

	public Football() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playAsTeam() {
		System.out.println("Kick football to start the game");
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getReferee() {
		return referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	@Override
	public void start() {
		System.out.println("Ball is kicked from the centre of the pitch");
		
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
