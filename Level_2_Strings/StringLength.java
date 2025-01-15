import java.util.*;
  public class StringLength{
     public static void main(String args[]){
	    Scanner sc= new Scanner(System.in);
	    String str= sc.nextLine();
	    int count=0;
	    int index=0;
	    int temp;
	  
	    try{
	      while(true){
			  temp = str.charAt(index);
			  count++;
			  index++;
		    }
	    }
        catch(Exception e){
             System.out.println("Length of a string is: "+count);
	        }		   
  }	 
  }   
	  