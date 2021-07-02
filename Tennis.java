
Ogbe, Eric
1:30 PM (0 minutes ago)
to me

package com.qa.sports;

public class Tennis extends IndividualSports {
private int game;
private int score;
public Tennis(int participants,int game,int score,String description) {
super("tennis", participants,description);
this.game = game;
this.score = score;
}
public void point(Tennis a) {
System.out.println(a.getName() + " gets a point");
}
public void rest(Tennis a) {
System.out.println(a.getName() + " is resting");
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
   

}
