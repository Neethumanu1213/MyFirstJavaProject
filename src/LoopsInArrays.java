
public class LoopsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print array
		String[] nameList = { "Parul", "Harinder", "Lekshmi", "Neethu" };
		for (int i =0;i<nameList.length ; i++) {
			System.out.println(nameList[i]);
		}
		
		//reverse order
		System.out.println("Reverse order of array");
		for (int i = (nameList.length - 1); i >= 0; i--) {
			System.out.println(nameList[i]);
		}
		int[] numbers=new int[5];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		for(int i=0;i<6;i++){
		System.out.println(numbers[i]);
		}
		


	}

}
