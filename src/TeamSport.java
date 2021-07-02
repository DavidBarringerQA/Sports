
public abstract class TeamSport extends Sport {
	
	private String type;
	private int teamPlayers;
	
	

	public TeamSport(String name, int players, String type, int teamPlayers) {
		super(name, players);
		this.type = type;
		this.teamPlayers = teamPlayers;
	}
	
	public TeamSport() {
		
	}

	public abstract void playAsTeam();


	public int getTeamPlayers() {
		return teamPlayers;
	}

	public void setTeamPlayers(int teamPlayers) {
		this.teamPlayers = teamPlayers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
