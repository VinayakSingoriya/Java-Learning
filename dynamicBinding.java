class A{
	void callMe(){
		System.out.println("I am from A");
	}
}
class B extends A{
	void callMe(){
		System.out.println("I am from B");
	}
}

//Main Class
class dynamicBinding{
	public static void main(String [] args){
		A a = new B();
		a.callMe();
		B b = new B();
		b.callMe();
	}
}