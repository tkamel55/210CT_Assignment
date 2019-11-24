public class TestShape {
	public static void main(String[] args) {

	      Circle circle;
	      Square square;

	      circle = new Circle("Circle" , new Point(22,8), 3.5);
	      square = new Square("Square", new Point(7.5,2.0), 18.0);

	      System.out.print(circle.getName() +
	                            ": " + circle.toString());
	      System.out.println("; Area = " + circle.getArea());

	      System.out.print(square.getName() +
	                            ": " + square.toString());
	      System.out.println("; Area = " + square.getArea());
	   }
}
