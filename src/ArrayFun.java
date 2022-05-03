
public class ArrayFun {

	public static void main(String[] args) {
		
		int[] myArray = new int[] {4, 5, 7, 8, 9, 10, 6, 62, 2};
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + (i < myArray.length - 1 ? ", " : ""));
		}

	}

}
