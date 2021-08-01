package mypackage2;
public class circle implements GeoAnalyzer{
	double radius;
	public circle(double r){
		radius = r;
	}
	public float area(){
		return (float)(PI*radius*radius);
	}
	public float perimeter(){
		return (float)(2*PI*radius);
	}
}