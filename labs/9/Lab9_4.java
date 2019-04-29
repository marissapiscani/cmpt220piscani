package lab9;
import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;
public class Lab9_4 {

	public static void main(String[] args) throws IOException {
	Scanner inputFile = new Scanner(System.in);
	System.out.println("Enter File Name: ");
	String inputfile=inputFile.nextLine();

	// JA: Input should come from the command line
	String outputfile="wordsoutput.txt";

	String deletemsg="hello" ;

	File file = new File(inputfile);

	FileWriter fw = new FileWriter(outputfile);
	try {

	Scanner sc = new Scanner(file);

	while (sc.hasNextLine()) {

	String i = sc.next();

	if(!i.equals(deletemsg)) fw.write(i+"\r\n");

	}

	fw.close();

	sc.close();

	System.out.println(deletemsg+" has deleted from the file "+inputfile+" resultant has writen to "+outputfile);

	}

	catch (FileNotFoundException e) {

	e.printStackTrace();

	}

	}

	}

