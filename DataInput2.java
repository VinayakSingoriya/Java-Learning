///Read two numbers from the command line and add them
class DataInput2{
	public static void main(String args []){
		float x, y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		System.out.printf("Addition of %f and %f is %f", x, y, x+y);		
	}
}