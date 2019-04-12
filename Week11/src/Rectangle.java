
public class Rectangle extends Shape implements IRectangle {
	
	private double length;
	private double width;
	public Rectangle() {
		super();
	}



	public double getArea(double l, double w) {
		length = l;
		width = w;
		super.area = length * width;
		return super.area;
	}

}
