import java.util.Scanner;

class point2D{
	int x, y;
	Scanner in = new Scanner(System.in);
	void input(){
		System.out.print("Enter value of x : ");
		x = in.nextInt();
		System.out.print("Enter value of y : ");
		y = in.nextInt();		
	}
	void display(){
		System.out.print("x = "+x+" y = "+y);
	}
}
class point3D extends point2D{
	int z;
	
	void input(){
		super.input();
		System.out.print("Enter value of z : ");
		z = in.nextInt();
	}
	
	void display(){
		System.out.print("x = "+x+" y = "+y+" z = "+z);
	}
	
}

//Main Class
class simpleSingleInheritance{
	public static void main(String [] args){
		System.out.println("Enter 1 for 2d Point..");
		System.out.println("Enter 2 for 3d Point..");
		System.out.println("Enter : ");
		Scanner take = new Scanner(System.in);
		int choice = take.nextInt();
		switch(choice){
			case 1:
				point2D obj1 = new point2D();
				obj1.input();
				obj1.display();
			break;
			
			case 2:
				point3D obj2 = new point3D();
				obj2.input();
				obj2.display();
			break;
			
			default:
				System.out.println("Invalid Choice.");
		}

		
	}
}