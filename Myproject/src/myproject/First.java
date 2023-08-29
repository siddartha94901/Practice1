package myproject;

public class First {
	public static void main(String[] args) {
		
		int[] integers = {1, 2, 3, 4, 5, 6};

		
		int sum = 0;

		
		for (int num : integers) {
		sum += num;
		}

		
		System.out.println("Array elements: 1, 2, 3, 4, 5, 6");
		System.out.println("Sum of the integers: " + sum);
		}
		
}
