//Input via Scanner class
import java.util.*;
class DataInput3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number a : ");
		int a = s.nextInt();
		System.out.print("Enter second number b : ");	
		int b = s.nextInt();
		System.out.printf("Addition of %d and %d is %d", a, b, a+b);
		
	}
}
