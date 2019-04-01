package lab6;

import java.util.*;

public class Goal {


	  private int minute;
	  private Player player;

	  Goal(){
	    minute = 0;
	    player = null;
	  }

	  Goal(int min, Player p){
	    minute = min;
	    player = p;
	  }

	  void setMinute(int minute){
	  this.minute = minute;
	  }

	  void setPlayer(Player player){
	    this.player = player;
	  }

	  int getMinute(){
	    return minute;
	  }

	  Player getPlayer(){
	    return player;
	  }

	  public String toString(){
	    return "\n Minute at which the goal is scored: " + minute +
	        "\n The player scored the goal: " + player.getName();
	  }
	}




