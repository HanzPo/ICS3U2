
public class LoopFun {

	public static void main(String[] args) {
		
		// 1. print 1-5 
		int j = 0;
		while (j < 5) {
			System.out.println(j + 1);
			j++;
		}
		
		System.out.println();
		
		// 2. print 5-1
		int i = 5;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		
		System.out.println();
		
		// 3. print 1-5 using do while
		i = 0;
		do {
			System.out.println(i + 1);
			i++;
		} while (i < 5);
		
		System.out.println();
		
		// 4. print 5-1 using do while
		i = 5;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
		
		System.out.println();
		
		// 5. print 0-4 using for loop
		for (int k = 0; k < 5; k++) {
			System.out.println(k);
		}
		
		System.out.println();
		
		// 6. print 1-4 using a for loop
		for (int k = 1; k < 5; k++) {
			System.out.println(k);
		}
		
		System.out.println();
		
		// 7. print 9-0 using a for loop
		for (int k = 10; k > 0; k--) {
			System.out.println(k - 1);
		}
		
		System.out.println();
		
		// 8. print 2 to 10 by 2s using a for loop
		for (int k = 0; k < 10; k += 2) {
			System.out.println(k + 2);
		}
		
		System.out.println();
		
		// 9. Print 5 to 40 by 5's
		for (int k = 0; k < 40; k += 5) {
			System.out.println(k + 5);
		}
		
		System.out.println();
		
		// 10. Create the following pattern using a for loop in a for loop
		for (int k = 0; k < 4; k++) {
			for (int l = 0; l < 5; l++) {
				System.out.printf("%d ", l + 1);
			}
			System.out.printf("%n");
		}
		
		System.out.println();
		
		// 11. Count from 3 to 30 by 3's
		for (int k = 3; k <= 30; k+=3) {
			System.out.printf("%d%n", k);
		}
		
		System.out.println();
		
		// 12. Count from 4 to 104 by 10's
		int l = 4;
		do {
			System.out.println(l);
			l += 10;
		} while (l <= 104);
		
		System.out.println();
		
		// 13. Write a while loop to create the following output
		l = 1;
		
		while (l <= 17) {
			if (l == 17) {
				System.out.printf("%d%n", l);
			}
			else {
				System.out.printf("%d, ", l);
			}
			
			l += 4;
		}
		
		System.out.println();
		
		// 14. Write a for loop to create the following output
		// 1
		// 3
		// 6
		// 10
		// 15
		// 21
		
		int lastOutput = 0;
		for (int k = 1; k <= 6; k++) {
			System.out.println(lastOutput + k);
			lastOutput += k;
		}
		
		System.out.println();
	}

}
