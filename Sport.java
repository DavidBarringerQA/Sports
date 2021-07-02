package com.qa.sports;

public abstract class IndividualSports extends Sport implements Iplay {
  private int participants;
  private String description;
 
 
public IndividualSports(String name,int participants,String description) {
super(name,1);
this.participants = participants;
this.description = description;
}


public int getParticipants() {
return participants;
}


public void setParticipants(int participants) {
this.participants = participants;
}


public String getDescription() {
return description;
}


public void setDescription(String description) {
this.description = description;
}


}
