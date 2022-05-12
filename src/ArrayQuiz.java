public class ArrayQuiz {

	public static void main(String[] args) {
		int[] grades = new int[] {9, 8, 6, 5, 4};

		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + (i == grades.length - 1 ? "" : ", "));
		}
		System.out.println();
		
		System.out.println(findHighestGrade(grades));
		System.out.println(findAverageGrade(grades, true, 6));
		
		
	}

	public static int findHighestGrade(int[] grades) {
		if (grades.length > 0) {
			int maxGrade = grades[0];
			
			for (int i = 0; i < grades.length; i++) {
				if (grades[i] > maxGrade) {
					maxGrade = grades[i];
				}
			}
			
			return maxGrade;
		}
		else {
			return -1;
		}
	}
	
	public static double findAverageGrade(int[] grades) {
		int sum = 0;
		
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		
		return (double) sum / grades.length;
	}
	
	public static double findAverageGrade(int[] grades, boolean ignoreLowMarks, int marksToIgnore) {
		int sum = 0;
		int highNums = 0;
		
		for (int i = 0; i < grades.length; i++) {
			if (ignoreLowMarks) {
				if (grades[i] >= marksToIgnore) {
					sum += grades[i];
					highNums++;
				}
			}
			else {
				sum += grades[i];
				highNums++;
			}
		}
		
		return (double) sum / highNums;
	}
	
	public static int areaRect(int length, int width) {
		return length * width;
	}
	
	public static int areaRect(int length) {
		return length * length;
	}
	
}
