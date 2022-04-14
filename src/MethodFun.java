
public class MethodFun {

	public static void main(String[] args) {
		System.out.println("Method fun...");

		welcome();
		welcome("Method fun");
		welcome("Method fun", 4);
	}
	
	public static void welcome() {
		System.out.println("Welcome to method fun");
	}

	public static void welcome(String pgmNa) {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("           Welcome to " + pgmNa);
		System.out.println("           ======================");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
	
	public static void welcome(String pgmNa, int lines) {
		welcome(pgmNa);
		for (int i = 0; i <= lines; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
}
