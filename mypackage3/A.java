package mypackage3;
public class A implements I1, I2{
	public int value = 999;
	public void printI1(){
		System.out.println("I am from I1 : "+i);
	}
	public void printI2() {
		System.out.println("I am from I2 : "+j);
	}
	public void printA(){
		System.out.println("I am from A : "+(i+j));
	}
}