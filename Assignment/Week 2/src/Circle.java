public class Circle extends Shape{

	
	private Point center ; 
	private double radius;
	
	public Circle(String n, Point center, double radius) {
		super(n);
		this.center = center; 
		this.radius = radius; 
		// TODO Auto-generated constructor stub
	}




	public double setRadius() {
		return radius ;
	}
	
	public double getRadius() {
		return radius; 
	}
	
	public Point setCenter() {
		return center; 
	}
	
	public Point getCenter() { 
		return center; 
	}



	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}


}