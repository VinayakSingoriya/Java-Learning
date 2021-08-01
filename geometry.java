import mypackage2.*;
class geometry{
	static void display(float x, float y){
		System.out.println("Area = "+x+" Perimeter = "+y);
	}
	public static void main(String args []){
		circle c = new circle(5.2);
		ellipse e = new ellipse(4.5, 3.6);
		rectangle r = new rectangle(5.0, 6.0);
		GeoAnalyzer geoItem;
		geoItem = c;
		display(geoItem.area(), geoItem.perimeter());
		geoItem = e;
		display(geoItem.area(), geoItem.perimeter());
		geoItem = r;
		display(geoItem.area(), geoItem.perimeter());
		
	}
}