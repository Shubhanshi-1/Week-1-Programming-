import java.util.*;
   public class LongestWord{
    public static void main(String args[]){
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter a Sentance: ");
	  String str = sc.nextLine();
	  String longestword ="";
	  for( String word : str.split(" ")){
	  if( word.length()> longestword.length()){
	     longestword = word;
		 }
	 }
	 System.out.println("Longest word is: "+longestword);
}
}