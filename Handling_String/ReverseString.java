import java.util.*;
  public class ReverseString{
    public static void main(String args[]){
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter a String:");
	   String string= sc.nextLine();
	   String newString ="";
	   char ch;
		for(int i=string.length()-1;i>=0;i--){
		   ch = string.charAt(i);
		   newString+=ch;
		   }
		System.out.println("Reverse string is : "+newString);
		}
	}
		  