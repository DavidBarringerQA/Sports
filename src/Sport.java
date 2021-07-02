
public abstract class Sport {
	
  private String name;
  private int players;

  public Sport(String name, int players){
    this.name = name;
    this.players = players;
  }
  
  public Sport() {
	  
  }

  public String getName(){
    return this.name;
  }

  public int getPlayers(){
    return this.players;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setPlayers(int players){
    this.players = players;
  }
}
