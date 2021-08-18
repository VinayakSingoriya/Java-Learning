import java.lang.*;
class myException extends Exception{
	myException(String message){
		super(message);
	}
}

class testMyException{
	public static void main(String args[]){
		int x = 5, y = 1000;
		try{
			float z = (float)x/(float)y;
			if(z<0.1) throw new myException("Given data are not proper");
		}
		catch(myException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.print("It print always.");
		}
	}
}