package lab6;

import java.util.*;

public class TestSoccerMatch {
	  public static void main(String[] args) {
		    
		    Random rand = new Random();

		    //Creates two Date class object for starting and ending time for game
		    @SuppressWarnings("deprecation")

		    Date d1 = new Date(2018, 11, 12, 10, 12, 30);

		    @SuppressWarnings("deprecation")

		    Date d2 = new Date(2018, 11, 12, 12, 40, 30);

		  //Creates a SoccerMatch
		    SoccerMatch sm = new SoccerMatch(d1, d2, "Ibiza", "Foxes", "Cobras");

		    //Creates home player names
		    String homePlayerName [] = {"William", "Suzie", "Claire", "Brandy", "Mary", "Jayne", "Julia", "Matt", "Chris", "Peter", "Henry"};

		    //Creates visiting player names
		    String visitPlayerName [] = {"Maddy", "Megan", "Gregs", "Koko", "Deijza", "Penelope", "Kourtney", "Madison", "Lee", "Helen", "Anne"};

		    //Loops 11 times to add players
		    for(int x = 0; x < 11; x++){
		      sm.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Dragen"));
		      sm.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Panthor"));
		    }

		    //Loops 10 times to add goals
		    for(int x = 0; x < 10; x++) {
		      sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[x]));
		      sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[x]));
		    }

		    //Loops 11 times to display home team players information
		    System.out.print("\n\n********** Home Team Players ********** ");

		    for(int x = 0; x < 11; x++) {
		      System.out.println(sm.homePlayers[x]);
		    }

		    //Loops 11 times to display visiting team players information
		    System.out.print("\n\n********** Visiting Team Players ********** ");

		    for(int x = 0; x < 11; x++) {
		      System.out.println(sm.visitorPlayers[x]);
		    }

		    //Loops 10 times to display home team goals information
		    System.out.print("\n\n********** Home Team Goals ********** ");

		    for(int x = 0; x < 10; x++) {
		      System.out.println(sm.homeGoals[x]);
		    }

		    //Loops 10 times to display visiting team goals information
		    System.out.print("\n\n********** Visiting Team Goals ********** ");

		    for(int x = 0; x < 10; x++) {
		      System.out.println(sm.visitorGoals[x]);
		    }

		    //Displays game status
		    System.out.print("\n\n********** GAME STATUS ********** ");

		    System.out.println(sm.getWinner());

		  }

		}

