package mypackage2;
public class ellipse implements GeoAnalyzer{
	double major, minor;
	public ellipse (double m, double n){
		major = m;
		major = n;
	}
	public float area(){
		return (float)(PI*major*minor);
	}
	public float perimeter(){
		return (float)(PI*(major+minor));
	}
}