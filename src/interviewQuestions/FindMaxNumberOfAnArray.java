package interviewQuestions;

public class FindMaxNumberOfAnArray {//biggest number of an array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numList= {0,1,7,200,1333,5643,456,9898};
		int lengthOfArray=numList.length;
		System.out.println(" the length of an array is "+lengthOfArray);
		//considering biggest num as a[0]
		int max=numList[0];
		for(int i=1;i<numList.length;i++) {
			if(numList[i]>max) {
				max=numList[i];
			}			
		}
		System.out.println(" The max number is "+max);
	}
}
