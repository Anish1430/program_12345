package loop;
import java.util.*;

public class hollow_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
		  for(int j=1;j<=columns;j++)
		  {
			  if(i==1 || i==rows ||	 j==1 ||j==columns)
				  System.out.print("*");
				  else
			  System.out.print(" ");
		  }
		  System.out.println();
		}}}
