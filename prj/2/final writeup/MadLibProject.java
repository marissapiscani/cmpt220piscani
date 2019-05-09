package madlibs;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class MadLibProject {
	graphics g= new graphics();


	public void displayIntro() {
		System.out.println("Hi welcome to Mad Libs! You will begin by entering your name and age. Then, you will pick one story to complete out of four. Once you are finished, you will have the chance to play again! Have fun!");
	}
	
	/*public String checkAorAn(String word) {
		char first = word.charAt(0);
		
		if (first == 'a'||first == 'e'||first == 'i' || first =='o'|| first=='u') 
			return "an "+word ;
		
		else return "a " +word;
		
	}*/
	public String replaceWords(String fname) throws Exception {
		String result="";
		Scanner s=new Scanner(System.in); //user input

		File file= new File(fname.trim());
		file.setReadable(true);
		//System.out.println(file.exists());  
		Scanner fScan=new Scanner(file);
		
		while(fScan.hasNext()) {
			String word=fScan.next();
			if(word.equals("verb")) {
				//ask for verb
				System.out.print("Please enter a verb");
				//get verb
				String verb=s.next();
				//add word to result
				result+=verb+" ";
			}
			else if(word.equals("noun")) {
				//ask for verb
				System.out.print("Please enter a noun");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("adjective")) {
				//ask for verb
				System.out.print("Please enter a adjective");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("verbing")) {
				//ask for verb
				System.out.print("Please enter a verb ending in ing");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("color")) {
				//ask for verb
				System.out.print("Please enter a color");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("emotion")) {
				//ask for verb
				System.out.print("Please enter a emotion");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("subject")) {
				//ask for verb
				System.out.print("Please enter a subject in school");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("place")) {
				//ask for verb
				System.out.print("Please enter a noun");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("person")) {
				//ask for verb
				System.out.print("Please enter a person");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("food")) {
				//ask for verb
				System.out.print("Please enter a food");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("animal")) {
				//ask for verb
				System.out.print("Please enter a animal");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("vehicle")) {
				//ask for verb
				System.out.print("Please enter a noun");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("teacher")) {
				//ask for verb
				System.out.print("Please enter a teacher's name");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("time")) {
				//ask for verb
				System.out.print("Please enter a time");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("game")) {
				//ask for verb
				System.out.print("Please enter a game");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("pnoun")) {
				//ask for verb
				System.out.print("Please enter a plural noun");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("plant")) {
				//ask for verb
				System.out.print("Please enter a plant");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("pbody")) {
				//ask for verb
				System.out.print("Please enter a part of the body");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else if(word.equals("number")) {
				//ask for verb
				System.out.print("Please enter a number");
				//get verb
				String noun=s.next();
				//add word to result
				result+=noun+" ";
			}
			else {
				//add word to result anyways
				result+=word+" ";
			}
			

		}
		//s.close();
		//fScan.close();
		//System.out.println(result);
		return result;
	}
	
	
	public void conclusion(String result) {
		g.displayStory(result);
		//System.out.print(result);
		//System.out.println();
	}
	
	

 }

