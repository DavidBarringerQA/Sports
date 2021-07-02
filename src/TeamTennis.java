
public class Tennis extends TeamSport {
	
	private int games;
	private int sets;
	private int totalPlayers;


	public Tennis(String name, int players, String type, int teamPlayers, int games, int sets, int totalPlayers) {
		super(name, players, type, teamPlayers);
		this.games = games;
		this.sets = sets;
		this.totalPlayers = totalPlayers;
	}


	public int getGames() {
		return games;
	}


	public void setGames(int games) {
		this.games = games;
	}


	public int getSets() {
		return sets;
	}


	public void setSets(int sets) {
		this.sets = sets;
	}


	public int getTotalPlayers() {
		return totalPlayers;
	}


	public void setTotalPlayers(int totalPlayers) {
		this.totalPlayers = totalPlayers;
	}


	@Override
	public void playAsTeam() {
		System.out.println("Team who won the toss, starts by serving the ball");
		
	}
	
	

}
