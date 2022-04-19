import javax.swing.*;  

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator");
		JFrame frame = new JFrame();
		Object[] operations = { "Addition", "Subtraction", "Multiplication", "Division" };
		
		try {
			int val1 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter the first input"));
			int val2 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Please enter the second input"));
			
			String op = (String) JOptionPane.showInputDialog(frame, "What operation would you like to do?", "Operation", JOptionPane.WARNING_MESSAGE, null, operations, operations[0]);
			
			if (op.equals(operations[0]))
			{
				JOptionPane.showMessageDialog(frame, add(val1, val2), "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (op.equals(operations[1]))
			{
				JOptionPane.showMessageDialog(frame, subtract(val1, val2), "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (op.equals(operations[2]))
			{
				JOptionPane.showMessageDialog(frame, multiply(val1, val2), "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else if (op.equals(operations[3]))
			{
				JOptionPane.showMessageDialog(frame, divide(val1, val2), "Answer", JOptionPane.PLAIN_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(frame, "Something went wrong", "Warning", JOptionPane.WARNING_MESSAGE);
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(frame, e, "Error message", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	
	public static int add (int val1, int val2) {
		return val1 + val2;
	}
	
	public static int subtract (int val1, int val2) {
		return val1 - val2;
	}

	public static int multiply (int val1, int val2) {
		return val1 * val2;
	}
	
	public static float divide (int val1, int val2) {
		return (float) val1 / val2;
	}
	
	
}
