// Imports packages
import java.util.*;
import java.text.*;

public class SalePrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Initializes variables
		int itemCount = 0;
		double discount = 0;
		double discountAmt = 0;
		double salePrice = 0;
		double sumOrig = 0;
		double sumSale = 0;

		// Prints welcome message
		welcome();

		// Sets the number of items in both lists based on user input about how much they want to purchase
		System.out.println("How many items would you like to purchase?");
		itemCount = Integer.parseInt(input.nextLine());

		String[] items = new String[itemCount];
		int[] prices = new int[itemCount];

		// Takes user input and assigns them to the arrays
		System.out.println("Enter the information for:");

		for (int i = 0; i < items.length; i++) {
			sumOrig += prices[i];

			System.out.printf("     Item %d's name:%n", i + 1);
			items[i] = input.nextLine();
			System.out.printf("     Item %d's price:%n", i + 1);
			prices[i] = Integer.parseInt(input.nextLine());
		}

		// Sorts both lists
		List<String> itemsCopy = Arrays.asList(items);
		ArrayList<String> sortedItems = new ArrayList<String>(itemsCopy);
		Collections.sort(sortedItems, (left, right) -> prices[itemsCopy.indexOf(left)] - prices[itemsCopy.indexOf(right)]);
		String[] newItems = sortedItems.toArray(new String[0]);
		
		Arrays.sort(prices);

		// Checks discount
		if (Arrays.stream(prices).max().getAsInt() > 50 || sumOrig >= 75) {
			discount = 0.3;
		}
		else if (Arrays.stream(prices).max().getAsInt() > 20 || sumOrig > 30){
			discount = 0.2;
		}
		else {
			discount = 0;
		}

		// Sets formatting for currency
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		// Prints out final information
		System.out.println("         Item      Orig      Discount      Sale Price");
		System.out.println("==============================================================");

		for (int i = 0; i < items.length; i++) {
			discountAmt = prices[i] * discount;
			salePrice = prices[i] - discountAmt;
			sumSale += salePrice;
			System.out.printf("%13s%10s%14s%16s%n", newItems[i], nf.format(prices[i]), nf.format(discountAmt), nf.format(salePrice));
		}

		System.out.printf("%nTotal:%47s%n", nf.format(sumSale));

		input.close();
	}

	public static void welcome() {
		// Shrek says welcome
		System.out.println("    ⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⠀");
		System.out.println("    ⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀  ⠀⠀ ");
		System.out.println("    ⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀  ⠀⠀");
		System.out.println("    ⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀  ");
		System.out.println("    ⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆ ");
		System.out.println("    ⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿");
		System.out.println("     ⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀");
		System.out.println("    ⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀  ⠀⠀⠀⠀");
		System.out.println("    ⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀  ⠀⠀⠀");
		System.out.println("⠀    ⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀   ⠀⠀⠀");
		System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀   ⠀⠀⠀⠀");
		System.out.println("⠀    ⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀        ⠀");
		System.out.println("⠀    ⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀   ⠀⠀⠀ ");
		System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀   ⠀⠀⠀⠀");
		System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉                ");
		System.out.println("    　　　∧");
		System.out.println("    ／￣ 　￣￣￣￣￣￣￣￣￣￣");
		System.out.println("    | Welcome to my swamp");
		System.out.println("    ＼＿＿＿＿＿＿＿＿＿＿＿＿");
		System.out.println("");
		System.out.println("========================Your Stuff============================");
		System.out.println("");
	}

}
