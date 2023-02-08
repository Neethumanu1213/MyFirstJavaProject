package interviewQuestions;

public class FindLargestAndSmallestInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numList= {12,25,87,100,13,15};
		int smallestNum=numList[0];
		int largestNum=numList[0];
		for(int i=1;i<numList.length;i++) {
			if(numList[i]>largestNum) {
				largestNum=numList[i];
			}else if(numList[i]<smallestNum){
				smallestNum=numList[i];
			}
		}
		System.out.println("The largest number is "+largestNum);
		System.out.println("The smallest number is "+smallestNum);

	}

}
