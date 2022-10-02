
public class WhileLoopCheckingSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print seconds until it reaches 0 and print stopwatch is stopped

		int timeShowedInStopwatch = 10;
		while (timeShowedInStopwatch >= 0) {
			System.out.println("The time remaining in  stopwatch  :" + timeShowedInStopwatch);
			timeShowedInStopwatch--;
		}
		System.out.println("The Stopwatch has stopped");
	}

}
