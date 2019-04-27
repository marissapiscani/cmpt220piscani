package lab9;

import java.util.Scanner;

public class Lab9_3 {
public static void main(String[] args) {
       Scanner input  = new Scanner(System.in);
       try{
       System.out.println("Enter a binary string:");
       String s = input.next();
       int integerValue = bin2Dec(Integer.parseInt(s));
       System.out.println("The decimal value of "+s+" is "+integerValue);
       }
       catch(NumberFormatException e){
           System.out.println(e);
       }
   }  
  
   public static int bin2Dec(int binaryNumber) throws NumberFormatException{

   int decimal = 0;
   int p = 0;
   try{
   while(true){
   if(binaryNumber == 0){
	  break;
   } else {
   int temp = binaryNumber%10;
   decimal += temp*Math.pow(2, p);
   binaryNumber = binaryNumber/10;
   p++;
   }
   }
   }
   catch(NumberFormatException e){
       throw new NumberFormatException("Invalid binary number");
   }
   return decimal;
   }
}