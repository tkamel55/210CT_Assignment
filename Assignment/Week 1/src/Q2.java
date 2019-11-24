
import java.util.Scanner;
/*Q2 is about entering two strings and checking 
 whether the second string is the substring or not 
*/
public class Q2 {

	    public static void main(String[] args) {
	        
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Enter string s1: ");
	        String s1 = in.nextLine();
	        
	        System.out.print("Enter string s2: ");
	        String s2 = in.nextLine();
	        
	        if (s1.indexOf(s2) != -1) {
	            System.out.printf(s2 +  " is a substring of " + s1);
	        }
	        else{
	            System.out.printf(s2 + " is not a substring of " + s1);
	        }
	    }
	}


