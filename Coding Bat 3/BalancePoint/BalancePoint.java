import java.util.Scanner;
public class BalancePoint {

	public static void main(String[] args)
	{
		// Read in the elements of an array
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();  // This line should contain the array contents
		String[] split = input.split("");	// Dividing it up using spaces will tell us how many numbers
		int[] array = new int[split.length]; // This makes  it possible to create the array of the proper length
		for (int index=0; index<split.length; ++index) // Now convert Strings to ints
		{
			array[index] = Integer.valueOf(split[index]);
		}

		// Print out the result
		System.out.println(balancePoint(array));
		keyboard.close();
	}

	public static int balancePoint(int[] array) {

		for (int idx = 0; idx < array.length; ++idx) {
			// Calculate the sum of the elements to the left of element idx.
			int sumLeft = 0;
			for (int j = 0; j < idx; ++j) {
				sumLeft += array[j];
			}

			// Calculate the sum of the elements to the right of element idx.
			int sumRight = 0;
			for (int j = idx + 1; j < array.length; ++j) {
				sumRight += array[j];
			}

			// Check if the two sums are equal to element idx.
			if (sumLeft == array[idx] && sumRight == array[idx]) {
				return idx;
			}
		}
		return -1;
	}
}
