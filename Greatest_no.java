package greatest;
import java.util.*;
public class Greatest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, largest, temp;   
		Scanner sc = new Scanner(System.in);  
		// input from the user  
		System.out.println("Enter the first number:");  
		n1 = sc.nextInt();  
		System.out.println("Enter the second number:");  
		n2 = sc.nextInt();  
		System.out.println("Enter the third number:");  
		n3 = sc.nextInt(); //comparing n1 and n2 and storing the largest number in a temp variable  
		temp=n1>n2?n1:n2;    
		largest=n3>temp?n3:temp;  
		//prints the largest number  
		System.out.println("The largest number is: "+largest);  
	}

}
