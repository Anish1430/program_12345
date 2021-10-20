package loop;
import java.util.*;
public class inverted_halfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=rows;i>=1;i--)  //(rows=number)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}}}
