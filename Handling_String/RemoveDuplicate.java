import java.util.*;
  public class RemoveDuplicate{
    public static void main(String args[]){
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter a string: ");
	   String string = sc.nextLine();
	   string.toLowerCase();
	    
		HashSet <Character> hashset = new HashSet<>();
		for(int i=0;i<string.length();i++){
			hashset.add(string.charAt(i));
		}
		
		for(char character : hashset){
			System.out.print(character+"");
		}
	}
  }