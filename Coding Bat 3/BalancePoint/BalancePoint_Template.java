import java.util.Scanner;
public class BalancePoint {

	public static void main(String[] args)
	{
	   // Do not edit the main program
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

	public static int balancePoint(int[] array)
	{
	   // Edit this method

		return 0; // Edit this line
	}
}
