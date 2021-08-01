abstract class Bike{
	abstract void run();
}
class Honda extends  Bike{
	void run(){
		System.out.println("Honda Running safely..");
	}
}
//Main Class
class abstractClass1{
	public static void main(String args []){
		Bike obj = new Honda();
		obj.run();
	}
}