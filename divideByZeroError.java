import java.util.*;
class divideByZeroError{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = in.nextInt();
		System.out.print("Enter b : ");
		int b = in.nextInt();
		try{
			int c = a/b;
			System.out.println(">> Result C : "+c);
			
		}
		catch(ArithmeticException e){
			System.out.print("b cannot be zero. E: "+e);
		}
		
		
	}
}