import javax.swing.*;

public class WhoIsAWinner2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		try {
			int scoresCount = Integer.parseInt(JOptionPane.showInputDialog(frame, "How many players do you have?"));
			int[] playerScores = new int[scoresCount];
			String[] playerNames = new String[scoresCount];
			StringBuilder stringBuilder = new StringBuilder();
			
			for (int i = 0; i < scoresCount; i++) {
				playerNames[i] = JOptionPane.showInputDialog(frame, String.format("Player %d name: ", i + 1));
				playerScores[i] = Integer.parseInt(JOptionPane.showInputDialog(frame, String.format("%s's score: ", playerNames[i])));
			}
			
			System.out.printf("%-25s %-15s %24s %n","Player", "Wins","Wins above Average");
			
			double average = average(playerScores);
			
			for (int i = 0; i < scoresCount; i++) {
				System.out.printf("%-25s %-15s %10s %n", playerNames[i], xChars(playerScores[i]),formatAvg(playerScores[i] - average));
			}
			
			JOptionPane.showMessageDialog(frame, "Win Stats\nWins: " + printWins(playerScores, stringBuilder) + "\nHigh: " + 
					maxValue(playerScores) + "\nLow: " + minValue(playerScores) + "\nSorted Wins: " + printWins(sortWinsHigh(playerScores), stringBuilder) + 
					"\nSorted Wins Reverse: " + printWins(sortWinsLow(playerScores), stringBuilder) + "\nAvesrage: " + average(playerScores) + 
					"\nMedian: " + median(playerScores) + "\nLongest Name: " + longestName(playerNames));
			
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(frame, e, "Error", JOptionPane.ERROR_MESSAGE);
		}

	}
	
	public static String printWins(int[] scores, StringBuilder stringBuilder) {
		stringBuilder.setLength(0);
		for (int i = 0; i < scores.length; i++) {
			stringBuilder.append(scores[i] + (i == scores.length - 1 ? "" : ", "));
		}
		return stringBuilder.toString();
	}
	
	public static int maxValue (int[] scores) {
		int maxValue = scores[0];
		
		for (int i = 0; i < scores.length; i++) {
			if ((int)scores[i] > maxValue) {
				maxValue = (int)scores[i];
			}
		}
		
		return maxValue;
	}
	
	public static int minValue (int[] scores) {
		int minValue = scores[0];
		
		for (int i = 0; i < scores.length; i++) {
			if ((int)scores[i] < minValue) {
				minValue = (int)scores[i];
			}
		}
		
		return minValue;
	}
	
	public static int[] sortWinsHigh (int[] scores) {
		int[] sortedScores = scores.clone();
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < scores.length - 1; i++) {
	            if (sortedScores[i] > sortedScores[i+1]) {
	                temp = sortedScores[i];
	                sortedScores[i] = sortedScores[i+1];
	                sortedScores[i+1] = temp;
	                sorted = false;
	            }
	        }
		}
		
		return sortedScores;
	}
	
	public static int[] sortWinsLow (int[] scores) {
		int[] sortedScores = scores.clone();
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < scores.length - 1; i++) {
	            if (sortedScores[i] < sortedScores[i+1]) {
	                temp = sortedScores[i];
	                sortedScores[i] = sortedScores[i+1];
	                sortedScores[i+1] = temp;
	                sorted = false;
	            }
	        }
		}
		
		return sortedScores;
	}
	
	public static double average(int[] wins) {
		int sum = 0;
		
		for (int i = 0; i < wins.length; i++) {
			sum += wins[i];
		}
		
		return (double)sum / wins.length;
	}
	
	public static double median (int[] wins) {
		int[] sortedWins = sortWinsHigh(wins);
		
		if (sortedWins.length % 2 == 0) {
			return ((double)sortedWins[sortedWins.length / 2] + (double)sortedWins[sortedWins.length/2 - 1])/2;
		}
		else {
			return (double)sortedWins[sortedWins.length / 2];
		}
	}
	
	public static String longestName(String names[]) {
		String longestString = "";
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > longestString.length()) {
				longestString = names[i];
			}
		}
		
		return longestString;
	}
	
	public static String xChars(int numberOfX) {
		String xCharacters = "";
		
		for (int i = 0; i < numberOfX; i++) {
			xCharacters += "X";
		}
		
		return xCharacters;
	}
	
	public static String formatAvg(double difference) {
		if (difference >= 0) {
			return "+" + String.valueOf(difference);
		}
		else {
			return "-" + String.valueOf(Math.abs(difference));
		}
	}
}
