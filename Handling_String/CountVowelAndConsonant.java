import java.util.*;
     public class CountVowelAndConsonant{
       public static void main(String args[]){
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter String");
          String s= sc.nextLine();
		  int cVowel=0;
		  int cConsonant=0;
		  s.toLowerCase();
          for(int i=0;i<s.length();i++){
			  if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
                  cVowel++;
			  } 
              else cConsonant++;
		  }
        System.out.println("Number of Vowels: "+cVowel+ " Number of Consonants: "+cConsonant);
	   }
	 }	   
	