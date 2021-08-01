import mypackage1.*;
public class GeoDemo{
	public static void main(String args []){
		Geometry geoObject [] = new Geometry[2];
		geoObject[0] = new circle(2.0);
		geoObject[1] = new Rectangle(1.0, 3.0);
		double totalArea = 0.0;
		for (int i = 0; i<2; i++){
			totalArea = totalArea + geoObject[i].area();
		}
		System.out.println("Total Area = "+totalArea);
	}
}