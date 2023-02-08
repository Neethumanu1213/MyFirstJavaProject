package interviewQuestions;

public class MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numList = { 1, 2, 6, 3, 2, };
		boolean descending = false;
		int flag = 0;
		if (numList.length < 3) {
			System.out.println("The array length should be greater than 3");
		}
		for (int i = 1; i < numList.length; i++) {
			if (!descending) {

				if (numList[i] < numList[i - 1]) {
					descending = true;
					// break;
				}
			} else {
				if (numList[i] > numList[i - 1]) {
					descending = true;
					// break;
				}
			}

		}
		if ((descending) ) {

			System.out.println("is an mountain array");
		} else {

			System.out.println("not an mountain array");
		}
	}

}
