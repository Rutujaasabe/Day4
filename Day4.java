
import java.util.*;
class Day4
{
     public static void main(String arg[])
  {
	System.out.println("Take a number from user = ");
                Scanner sc=new Scanner(System.in);
               int a=sc.nextInt();
	if(a>0)
      {
	System.out.println("positive number");
         }
         else if (a<0)
	{
	     System.out.println("negative number");
	}
	else
            	     System.out.println("neither positive nor negative");
    }
}