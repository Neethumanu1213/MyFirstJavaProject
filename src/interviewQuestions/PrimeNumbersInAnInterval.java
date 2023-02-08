//Write a Program to Display Prime Numbers Between Two Intervals

package interviewQuestions;

public class PrimeNumbersInAnInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startInterval=100;
		int endInterval=120;
	System.out.println(String.format("The primr number between %d to %d are",startInterval,endInterval));
		//boolean isPrime=false;
		while(startInterval<endInterval) {
			for(int i=2;i<startInterval/2;i++) {
				if(startInterval%i==0) {
				//isPrime=true;
				break;
				}else {
					System.out.println(startInterval);	
					break;
				}
					
			}
			startInterval++;
		}

	}

}
