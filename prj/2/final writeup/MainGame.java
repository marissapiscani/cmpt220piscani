package madlibs;
import java.util.*;

public class MainGame {

	public static void main(String[] args) throws Exception {
		MadLibProject game = new MadLibProject();
		Scanner s= new Scanner(System.in);
		game.displayIntro();
		System.out.print("What is your name?");
		
		String name = s.nextLine();
		System.out.print("What is your age "+name+"?");
		int age = s.nextInt();
		Player player1= new Player(name, age);
		System.out.print("Ok,"+ name+", it's time play a game");
		boolean playAgain=true;
		while(playAgain==true) {
			storyFile file1=new storyFile("src/madlibs/txtfiles/holidayquest.txt");//replace filename with .txt file for each
			storyFile file2 = new storyFile("src/madlibs/txtfiles/vacation.txt");
			storyFile file3 = new storyFile("src/madlibs/txtfiles/mariststory.txt");
			storyFile file4 = new storyFile("src/madlibs/txtfiles/rap.txt");
			storyFile[] stories= {file1,file2,file3,file4};
			System.out.println("What story would you like? (1-4)");
			int storyNum=s.nextInt();
			System.out.println("Thank you for picking story"+ storyNum);
			storyFile chosenStory=stories[storyNum-1];
			//System.out.print(chosenStory.getFileName());
			String result=game.replaceWords(chosenStory.getFileName());
			//System.out.println(result);
			game.conclusion(result);
			System.out.print("Would you like to play again?");
			String answer=s.next().toLowerCase();
			if(answer.equals("n")) {
				playAgain=false;
			}
			else {
				playAgain=true;
			}
		}
		

	}

}
