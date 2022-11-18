package learningRunTimePolymorphism;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
//		Shapes shapes=new Triangel();
//		shapes.areaOfShapes();
//		
//		Shapes shapes1=new Circle();
//		shapes1.areaOfShapes();
//
//		Shapes shapes2=new Square();
//		shapes2.areaOfShapes();

		Shapes shapes3=null;
	
		System.out.println("Enter the shape youn want");
		String selectedShape=sc.next();
	
		switch (selectedShape) {
		case "Shapes":
			 shapes3=new Shapes();				
				break;
		case "Circle":
		 shapes3=new Circle();
			break;
		case "Square":
			 shapes3=new Square();	
			break;
		case "Triangel":
			 shapes3=new Triangel();			
			break;
		default:
			System.out.println("invalid name");
			break;
		}
		shapes3.areaOfShapes();
	}

}
