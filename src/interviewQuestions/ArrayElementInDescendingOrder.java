//Write a program to print the numbers in an array in descending order
package interviewQuestions;


import java.util.Arrays;

public class ArrayElementInDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numList= {90,10,23,54,50,40,200,45};
		System.out.println("The array elements are "+Arrays.toString(numList));
		for(int i=0;i<numList.length;i++) {
			System.out.println(numList[i]);
		}
		System.out.println("The array in descending order is");
		int largestNum=0;
		for(int i=0;i<numList.length;i++) {
			for(int j=i+1;j<numList.length;j++) {
				if(numList[i]<numList[j]) {
					
					largestNum=numList[j];
					numList[j]=numList[i]; 
					numList[i]=largestNum;
				}
			}
			System.out.println(numList[i]);
		} 

	}

}
