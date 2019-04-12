
public class Circle extends Shape implements ICircle{
	private double radius;
	
	
	public Circle() {
		super();
	}
	
	@Override
	public double getArea(double _radius) {
		radius = _radius;
		super.area = Math.PI * radius * radius;
		return super.area;
		
	}

}
