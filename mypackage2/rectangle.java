package mypackage2;
public class rectangle implements GeoAnalyzer{
	double length, width;
	public rectangle(double l, double w){
		length = l;
		length = w;
	}
	public float area(){
		return (float)(length*width);
	}
	public float perimeter(){
		return (float)(2*(length+width));
	}
}