package lab6;

import java.util.*;

public class SoccerMatch {
	

	Date startTime;
	Date endTime;
	String location;
	String home;
	String visitor;
	Player homePlayers[];
	Player visitorPlayers[];
	Goal homeGoals[];
	Goal visitorGoals[];
	int homePlayerCounter;
	int visitPlayerCounter;
	int homeGoalCounter;
	int visitGoalCounter;

	SoccerMatch(){

	  startTime = endTime = null;
	  location = home = visitor = null;
	  homePlayers = new Player[11];  
	  visitorPlayers = new Player[11];  
	  homeGoals = new Goal[10];
	  visitorGoals = new Goal[10];
	  homePlayerCounter = 0;
	  visitPlayerCounter = 0;
	  homeGoalCounter = 0;
	  visitGoalCounter = 0;
	  
	  for(int x = 0; x < 11; x++){
	    homePlayers[x] = new Player();
	    visitorPlayers[x] = new Player(); 
	  } 
	  
	  for(int x = 0; x < 10; x++){
	    homeGoals[x] = new Goal();
	    visitorGoals[x] = new Goal();
	   } 

	}

	SoccerMatch(Date startTime, Date endTime, String location, String home, String visitor){

	  this();

	  this.startTime = startTime;
	  this.endTime = endTime;
	  this.location = location;
	  this.home = home;
	  this.visitor = visitor;
	}

	void addHomePlayer(Player p){
	  homePlayers[homePlayerCounter++] = p;
	 } 


	void addVisitorPlayer(Player p){
	  visitorPlayers[visitPlayerCounter++] = p;
	} 

	void addHomeGoal(Goal g){
	  homeGoals[homeGoalCounter++] = g;
	} 

	void addVisitorGoal(Goal g){
	  visitorGoals[visitGoalCounter++] = g;
	} 

	int [] getHomeGoals(){
	  int goals[] = new int[10];
	  for(int x = 0; x < 10; x++) {
	    goals[x] = homeGoals[x].getPlayer().getGoals();
	  }
	  
	  return goals;
	} 


	int [] getVisitorGoals(){
	  int goals[] = new int[10];
	  for(int x = 0; x < 10; x++) {
	    goals[x] = visitorGoals[x].getPlayer().getGoals();
	  }
	  
	  return goals;

	} 


	String getWinner(){

	  String winStatus = "";
	  
	  int homeGoals[] = getHomeGoals();
	  int visitGoals[] = getVisitorGoals();
	  int totHome = 0, totVisit = 0;
	  
	  for(int x = 0; x < 10; x++){
	    totHome += homeGoals[x];
	    totVisit += visitGoals[x];
	  } 
	  
	  winStatus = "\n Home Team Total Goals: " + totHome + "\n Visitor Team Total Goals: " + totVisit;
	  
	  if(totHome > totVisit) {
	    winStatus += "\n Winner: Home Team";
	  } else if(totVisit > totHome) {
	    winStatus += "\n Winner: Visitor Team";
	  } else {
	    winStatus += "\n Tie"; 
	  }
	  
	  return winStatus;

	} 

	}

