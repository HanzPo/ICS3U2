import java.util.*;
import javax.swing.*;

public class WhoIsAWinner {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		try {
			HashMap<String, Integer> playerScores = new HashMap<String, Integer>();
			int scoresCount = Integer.parseInt(JOptionPane.showInputDialog(frame, "How many players do you have?"));
			StringBuilder stringBuilder = new StringBuilder();
			
			for (int i = 0; i < scoresCount; i++) {
				playerScores.put(JOptionPane.showInputDialog(frame, CapitalizeFirstLetter(String.format("Player %d name: ", i + 1))), Integer.parseInt(JOptionPane.showInputDialog(frame, String.format("Player %d score: ", i + 1))));
			}
			
			System.out.println("Wins: " + printWins(playerScores.values().toArray(), stringBuilder));
			System.out.println("High: " + maxValue(playerScores.values().toArray()));
			System.out.println("Low: " + minValue(playerScores.values().toArray()));
			System.out.println(sortWinsLow(playerScores.values().toArray(), stringBuilder));
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(frame, e, "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static String CapitalizeFirstLetter(String value) {
		if (value.length() > 0) {
			return value.substring(0, 1).toUpperCase() + value.substring(1);
		}
		return value;
	}
	
	public static String printWins(Object[] objects, StringBuilder stringBuilder) {
		stringBuilder.setLength(0);
		for (int i = 0; i < objects.length; i++) {
			stringBuilder.append(objects[i] + (i == objects.length - 1 ? "" : ", "));
		}
		return stringBuilder.toString();
	}
	
	public static int maxValue (Object[] objects) {
		int maxValue = 0;
		
		for (int i = 0; i < objects.length; i++) {
			if ((int)objects[i] > maxValue) {
				maxValue = (int)objects[i];
			}
		}
		
		return maxValue;
	}
	
	public static int minValue (Object[] objects) {
		int minValue = 0;
		
		for (int i = 0; i < objects.length; i++) {
			if ((int)objects[i] < minValue) {
				minValue = (int)objects[i];
			}
		}
		
		return minValue;
	}
	
	public static String sortWinsLow (Object[] objects, StringBuilder stringBuilder) {
		stringBuilder.setLength(objects.length);
		Object[] objectsCopy = objects.clone();
		for (int i = 0; i < objectsCopy.length; i++) {
			stringBuilder.insert(i, minValue(objectsCopy));
			objectsCopy[i] = (Object)Integer.MAX_VALUE;
		}
		
		return stringBuilder.toString();
	}
}
