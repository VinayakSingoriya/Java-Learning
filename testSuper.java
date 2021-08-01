class Animal{
	Animal(){
		System.out.println("Animal is Created");
	}
}

class Cat extends Animal{
	Cat(){
		super();
		System.out.println("Cat is Created");
	}
}

class Tiger extends Cat{
	Tiger(){
		super();
		System.out.println("Tiger is Created");
	}
}

//Main class
class testSuper{
	public static void main(String [] args){
		Animal A =new Animal();
		System.out.println("-----------------");
		Cat c = new Cat();
		System.out.println("-----------------");
		Tiger T = new Tiger();
		System.out.println("-----------------");
		
	}
}