package madlibs;

public class graphics {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	String[] color= {ANSI_BLACK,ANSI_RED,ANSI_GREEN, 
			ANSI_YELLOW, ANSI_BLUE, ANSI_PURPLE,ANSI_CYAN,ANSI_WHITE} ;
	
	public graphics(){
		
	}
	public void displayStory(String story) {
		// print out story
		String story1=story;
		String[] sent = story1.split("\\.");
		//System.out.println(story);
		//System.out.println(sent.length);
		int count=0;
		for (int i = 0; i < sent.length; i++) {
			 System.out.println(color[count]+sent[i]+ANSI_RESET);
			 count++;
			 if(count>7) {
				 count=0;
			 }
		}
	}
}