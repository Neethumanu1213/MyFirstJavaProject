package learningCompileTimePolymorphism;

public class Area {
	
	
	public void areaOfShapes(double radius) {
		double areaOfCircle=3.14*radius*radius;
		System.out.println("The area of circle is "+areaOfCircle);
		
	}
	
	public void areaOfShapes(int length) {
		int areaOfSquare=length*length;
		System.out.println("The area of square is "+areaOfSquare);
	}
	
	public void areaOfShapes(double length,double breadth) {
		double areaOfTriangle=(length*breadth)/2;
		System.out.println("The area of triangle is "+areaOfTriangle);
	}
	
	public double areaOfShapes(float a, float b) {
		return 0;
		
	}

}