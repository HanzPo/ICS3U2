public class StringFun {

	public static void main(String[] args) {
		String fruit = "Apple";
		String fruitUpper;
		
		System.out.println("My fruit: " + fruit);
		System.out.println("To Upper: " + fruit);

		fruit.toUpperCase();
		fruitUpper = fruit.toUpperCase();
		
		System.out.println("My fruit 2: " + fruit);
		System.out.println("My Upper Fruit: " + fruitUpper);
		
		System.out.println("My fruit length: " + fruit.length());
		
		System.out.println("Print off each char");
		
		for (int i = 0; i < fruit.length(); i++) {
			System.out.println(i + ") " + fruit.charAt(i));
		}
		
		System.out.println("Count all the p");
		
		int cnt = 0;
		char val;
		
		for (int i = 0; i < fruit.length(); i++) {
			val = fruit.charAt(i);
			System.out.println(val);
			
			if (val == 'p') {
				cnt++;
			}
		}
		System.out.println("Number of p is " + cnt);
	}

}
