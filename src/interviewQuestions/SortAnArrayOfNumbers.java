package interviewQuestions;

public class SortAnArrayOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numList= {2,1,90,23,63,7,12};
		System.out.println("The unsorted array is ");
		for(int i=0;i<numList.length;i++) {
			System.out.print(numList[i]+" ");
		}
		int smallestNumber=numList[0];
		System.out.println("\nThe sorted array is ");
		for(int i=0;i<numList.length;i++) {
			for(int j=i+1;j<numList.length;j++) {
				if(numList[i]>numList[j]) {
					smallestNumber=numList[j];
					numList[j]=numList[i]; 
					numList[i]=smallestNumber;
				}
			}
			System.out.print(numList[i]+" ");
		}
		
	}

}
