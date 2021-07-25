class Circle{
	double x, y;  // Fields
	double r;
	// Constructor_1
	Circle(double x, double y, double r){
		this.x = x; this.y = y; this.r = r;
	}
	// Constructor_2
	Circle(double r){
		this(3.0, 3.0, r);
	}
	// Constructor_3
	Circle(Circle c){
		this(c.x, c.y, c.r);
	}
	
	double circumference(){
		return 2*3.14159*r;
	}
	
	double area(){
		return 3.14159*r*r;
	}
}

class Box{
	double width;
	double depth;
	double height;
	
	// Constructor 1
	Box(double w, double d, double h){
		this.width = w; this.depth = d; this.height = h;
	}
	// Constructor 2
	Box(Box b){
		this.width = b.width; this.depth = b.depth; this.height = b.height;
	}
	
	double area(){
		double a;
		a = (width*height+height*depth+width*depth)*2;
		return a;
	}
}

class MultipleClass{
	public static void main(String args []){
		//Create circle objects
		Circle c1 = new Circle(3.0, 3.0, 2.0);
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle(c1);
		//Create box objects
		Box b1 = new Box(1.0, 1.0, 1.0);
		Box b2 = new Box(b1);
		//Call Methods
		System.out.println(">> Circle ----------->>>>>>");
		System.out.println("Circumference of Circle c1 : "+c1.circumference());
		System.out.println("Circumference of Circle c2 : "+c2.circumference());
		System.out.println("Circumference of Circle c2 : "+c2.circumference());
		System.out.println("Area of Circle c1 : "+c1.area());
		System.out.println("Area of Circle c2 : "+c2.area());
		System.out.println("Area of Circle c3 : "+c3.area());
		System.out.println(">> Box ----------->>>>>>");
		System.out.println("Area of Box b1 : "+b1.area());
		System.out.println("Area of Box b2 : "+b2.area());
				
	}
}