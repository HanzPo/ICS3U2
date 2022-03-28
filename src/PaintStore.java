import java.util.*;

public class PaintStore {

	public static String[] asciiArt = {
			"⠄⠄⣰⣾⣿⣿⣿⠿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣆⠄⠄ "
			,"⠄⠄⣿⣿⣿⡿⠋⠄⡀⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠋⣉⣉⣉⡉⠙⠻⣿⣿⠄⠄ "
			,"⠄⠄⣿⣿⣿⣇⠔⠈⣿⣿⣿⣿⣿⡿⠛⢉⣤⣶⣾⣿⣿⣿⣿⣿⣿⣦⡀⠹⠄⠄ "
			,"⠄⠄⣿⣿⠃⠄⢠⣾⣿⣿⣿⠟⢁⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠄⠄ "
			,"⠄⠄⣿⣿⣿⣿⣿⣿⣿⠟⢁⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠄⠄ "
			,"⠄⠄⣿⣿⣿⣿⣿⡟⠁⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄ "
			,"⠄⠄⣿⣿⣿⣿⠋⢠⣾⣿⣿⣿⣿⣿⣿⡿⠿⠿⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄ "
			,"⠄⠄⣿⣿⡿⠁⣰⣿⣿⣿⣿⣿⣿⣿⣿⠗⠄⠄⠄⠄⣿⣿⣿⣿⣿⣿⣿⡟⠄⠄ "
			,"⠄⠄⣿⡿⠁⣼⣿⣿⣿⣿⣿⣿⡿⠋⠄⠄⠄⣠⣄⢰⣿⣿⣿⣿⣿⣿⣿⠃⠄⠄ "
			,"⠄⠄⡿⠁⣼⣿⣿⣿⣿⣿⣿⣿⡇⠄⢀⡴⠚⢿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢠⠄⠄ "
			,"⠄⠄⠃⢰⣿⣿⣿⣿⣿⣿⡿⣿⣿⠴⠋⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⡟⢀⣾⠄⠄ "
			,"⠄⠄⢀⣿⣿⣿⣿⣿⣿⣿⠃⠈⠁⠄⠄⢀⣴⣿⣿⣿⣿⣿⣿⣿⡟⢀⣾⣿⠄⠄ "
			,"⠄⠄⢸⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⢶⣿⣿⣿⣿⣿⣿⣿⣿⠏⢀⣾⣿⣿⠄⠄ "
			,"⠄⠄⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣶⣿⣿⣿⣿⣿⣿⣿⠋⣠⣿⣿⣿⣿⠄⠄ "
			,"⠄⠄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢁⣼⣿⣿⣿⣿⣿⠄⠄ "
			,"⠄⠄⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢁⣴⣿⣿⣿⣿⣿⣿⣿⠄⠄ "
			,"⠄⠄⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⢁⣴⣿⣿⣿⣿⠗⠄⠄⣿⣿⠄⠄ "
			,"⠄⠄⣆⠈⠻⢿⣿⣿⣿⣿⣿⣿⠿⠛⣉⣤⣾⣿⣿⣿⣿⣿⣇⠠⠺⣷⣿⣿⠄⠄ "
			,"⠄⠄⣿⣿⣦⣄⣈⣉⣉⣉⣡⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⠉⠁⣀⣼⣿⣿⣿⠄⠄ "
			,"⠄⠄⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣾⣿⣿⡿⠟⠄⠄ " };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Paint Store Display Centre");
		System.out.println();
		System.out.println("1) Make a Rectangle Paint Can Display");
		System.out.println("2) Make a Pyramid (Odd Can's Only)");
		System.out.println("3) Make an Upside Down Pyramid ");
		System.out.println("4) Make a Diamond Display (Odd Can's Only)");
		System.out.println("5) Make an X display");

		int userSelection = Integer.parseInt(input.nextLine());
		switch (userSelection) {
		case 1:
			System.out.println("How many rows would you like your rectangle to have?");
			int rectRows = Integer.parseInt(input.nextLine());
			System.out.println("How many columns would you like your rectangle to have?");
			int rectColumns = Integer.parseInt(input.nextLine());
			rectangle(rectRows, rectColumns);
			break;
		case 2:
			System.out.println("How tall would you like the pyramid to be?");
			pyramid(Integer.parseInt(input.nextLine()));
			break;
		case 3:
			System.out.println("How tall would you like the pyramid to be?");
			pyramidDown(Integer.parseInt(input.nextLine()), false);
			break;
		case 4:
			System.out.println("How tall would you like the diamond to be?");
			diamond(Integer.parseInt(input.nextLine()));
			break;
		case 5:
			System.out.println("How wide would you like the X to be?");
			int xWidth = Integer.parseInt(input.nextLine());
			System.out.println("How tall would you like the X to be?");
			int xHeight = Integer.parseInt(input.nextLine());
			myX(xWidth, xHeight);
			break;
		}

		input.close();
	}

	public static void rectangle(int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < asciiArt.length; k++) {
				for (int j = 0; j < columns; j++) {
					System.out.printf(asciiArt[k]);
				}
				System.out.printf("%n");
			}
		}
	}

	public static void pyramid(int rows) {
		int i = 0;
		while (i < (rows * 2)) {
			for (int k = 0; k < asciiArt.length; k++) {
				for (int j = 0; j < (((rows * 2) - i) / 2) - 1; j++) {
					System.out.printf("                                      ");
				}
				for (int j = 0; j < (i + 1); j++) {
					System.out.printf(asciiArt[k]);
				}
				System.out.printf("%n");
			}
			i += 2;
		}
	}

	public static void pyramidDown(int rows, boolean isDiamond) {
		int i = rows * 2;
		while (i > 0) {
			for (int k = 0; k < asciiArt.length; k++) {
				for (int j = 0; j < (((rows * 2) - i) / 2); j++) {
					if (isDiamond && i == rows * 2 && rows != 1) {
						System.out.printf("");
					}
					else {
						System.out.printf("                                      ");
					}
				}
				for (int j = 0; j < (i - 1); j++) {
					if (isDiamond && i == rows * 2 && rows != 1) {
						System.out.printf("");
					}
					else {
						System.out.printf(asciiArt[k]);
					}
				}
				if (isDiamond && i == rows * 2 && rows != 1) {
					System.out.printf("");
				}
				else {
					System.out.printf("%n");
				}
				
			}
			i -= 2;
		}
	}

	public static void myX (int width, int height) {
		if (width % 2 == 0 || height % 2 == 0) {
			System.out.println("Please enter odd numbers for the dimensions of the X");
		}
		else if (width == height){
			for (int i = 0; i < height; i++) {
				for (int k = 0; k < asciiArt.length; k++) {
					for (int j = 0; j < width; j++)
					{
						if (j == i || j == (width - i) -1)
						{
							System.out.printf(asciiArt[k]);
						}
						else {
							System.out.printf("                                      ");
						}
					}
					System.out.println();
				}
			}
		}
		else {
			int biggerDimension = (width > height ? width : height);
			int smallerDimension = (width < height ? width : height);

			if (biggerDimension == height) {
				for (int i = 0; i < biggerDimension; i++) {
					for (int j = 0; j < biggerDimension; j+= (biggerDimension - smallerDimension) - 1)
					{
						if (j == i || j == (biggerDimension - i) - 1)
						{
							System.out.printf("X");
						}
						else {
							System.out.printf(" ");
						}
					}
					System.out.println();
				}
			}
			else if (biggerDimension == width){
				for (int i = 0; i < biggerDimension; i += (biggerDimension - smallerDimension)) {
					for (int j = 0; j < smallerDimension; j++)
					{
						if (j == i || j == (smallerDimension - i) - 1)
						{
							System.out.printf("X");
						}
						else {
							System.out.printf(" ");
						}
					}
					System.out.println();
				}
			}
			else {
				System.out.println("You messed something up lol");
			}
		}
	}

	public static void diamond(int rows) {
		if (rows % 2 == 0) {
			System.out.println("Please enter an odd number of rows");
		}
		else {
			int halfRows = (int)Math.ceil(rows / 2) + 1;
			pyramid(halfRows);
			pyramidDown(halfRows, true);
		}
	}

}
