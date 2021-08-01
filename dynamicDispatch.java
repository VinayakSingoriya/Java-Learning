class Bike{
	void run(){
		System.out.println("Bike is Runnig.....");
	}
}

class Splendor extends Bike{
	void run(){
		System.out.println("Runnig safely with 60 km by splendor...");
	}
}

//Main Class
class dynamicDispatch{
	public static void main(String args []){
		Splendor b1 = new Splendor();
		b1.run();
		Bike b2 = new Bike();
		b2.run();
		Bike b3 = new Splendor();
		b3.run();
		//Splendor b4 = new Bike();
		//b4.run();
	}
}