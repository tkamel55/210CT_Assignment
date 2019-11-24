public class Square extends Shape {
	private Point topLeft;  
	private double width;
	

   public Square(String n, Point topLeft, double width) {
		super(n);
	
		this.width = width;
		this.topLeft = topLeft;
		// TODO Auto-generated constructor stub
	}

  
   public double getArea() {
	// TODO Auto-generated method stub
	return width*width; 
}
   
   
   public double setWidth() { 
	   return width ; 
   }
   
   public double getWidth() { 
	   return width ; 
   }
   
   public Point setTopLeft() { 
	   return topLeft ; 
   }
   
   public  Point getTopLeft() { 
	    
	   return topLeft ; 

   }
  


	public String toString() {
		return "Square [topLeft=" + topLeft + " width=" + width + "]";
	}


}