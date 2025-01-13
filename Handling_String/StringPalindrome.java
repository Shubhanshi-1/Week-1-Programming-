import java.util.*;
  public class StringPalindrome{
    public static void main(String args[]){
	  Scanner sc= new Scanner(System.in);
	  String newString = "";
	  char ch;
	  System.out.println("Enter a String:");
	   String string1= sc.nextLine();
	   for(int i=string1.length()-1;i>=0;i--){
		   ch = string1.charAt(i);
		   newString+=ch;
		   }
		   boolean res= string1.equals(newString);
		   
		   if(res){
			   System.out.println("String is palindrome");
		   }
		   else System.out.println("String is not palindrome");
	}
  }
	   