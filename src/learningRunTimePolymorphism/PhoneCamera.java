package learningRunTimePolymorphism;

import java.util.Scanner;

public class PhoneCamera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
//		IPhone iPhone=new IPhone();
//		iPhone.phoneCamera();
//		
//		IPhone iPhone10=new IPhone10();
//		iPhone10.phoneCamera();
//		
//		IPhone iPhone11=new IPhone11();
//		iPhone11.phoneCamera();
//		
		IPhone iPhone=null;
		System.out.println("Enter the model of Phone");
		String selectedModel=sc.next();
		switch (selectedModel) {
		case "IPhone":
			iPhone=new IPhone();
			
			break;
		case "IPhone10":
			iPhone=new IPhone10();
			
			break;
		case "IPhone11":
			iPhone=new IPhone11();
			
			break;
		default:
			break;
		}
		iPhone.phoneCamera();

	}

}
