import javax.swing.*;  

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator");
		JFrame frame = new JFrame();
		
		try {
			int val1 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter the first input"));
			int val2 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter the second input"));
			
			JOptionPane.showMessageDialog(frame, add(val1, val2));
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(frame, e, "Error message", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	
	public static int add (int val1, int val2) {
		return (val1 + val2);
	}

}
