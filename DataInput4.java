//Input via DataInputStream class
import java.io.*;
class DataInput4{
	public static void main(String args []){
		Float principalAmount = new Float(0);
		Float rateOfInterest = new Float(0);
		int numberOfYears = 0;
		
		try{
			DataInputStream in = new DataInputStream(System.in);
			String tempString;
			System.out.print("Enter Principal amount : ");
			System.out.flush();
			tempString = in.readLine();
			principalAmount = Float.valueOf(tempString);
			System.out.print("Enter Rate of Interest : ");
			System.out.flush();
			tempString = in.readLine();
			rateOfInterest = Float.valueOf(tempString);
			System.out.print("Enter Number of years : ");
			System.out.flush();
			tempString = in.readLine();
			numberOfYears = Integer.parseInt(tempString);
			
			float interestTotal = principalAmount*rateOfInterest*numberOfYears;
			System.out.print("Total Interest : "+interestTotal);		
		}
		catch(Exception ex){}
	}
}