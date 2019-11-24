import java.util.Scanner;

/*q1 is about checking whether the number entered is
  an 3 digit armstrong number or not 
*/
public class Q1
{
    public static void main(String args[])
    {
        int num, onum, total=0, rem;
        Scanner scan = new Scanner(System.in);
        
		
        System.out.print("Enter 3 digit number : ");
        num = scan.nextInt();
		
        onum = num;
		
        while(onum != 0)
        	
        {
        	//formula for finding the armstrong number 
            rem = onum%10;
            total = total + rem*rem*rem;
            onum = onum/10;
        }
        if(total == num)
        {
            System.out.print(num+ " is an Armstrong Number");
        }
        else
        {
            System.out.print(num + " is not an Armstrong Number");
        }
    }
}
