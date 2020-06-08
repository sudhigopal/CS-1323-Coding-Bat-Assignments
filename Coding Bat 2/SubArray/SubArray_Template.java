import java.util.Arrays;
import java.util.Scanner;

public class SubArray
{

	public static void main(String[] args)
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);

		String line = keyboard.nextLine();
		String [] numbers = line.split(" ");
		int[] array = new int[numbers.length];
		// Test after && is unnecessary, but better to be safe than sorry
		for (int index = 0; index<numbers.length && index < array.length; ++index)
		{
			array[index] = Integer.valueOf(numbers[index]);
		}

		int start = keyboard.nextInt(); // Did not read in newline here because people may put both
										// bounds on one line
		int end = keyboard.nextInt();
		keyboard.nextLine();

		int[] result = subArray(array, start, end);

		System.out.println(Arrays.toString(result));
		keyboard.close();
	}

	// Start and end are inclusive--this is different than the usual practice in Java
	public static int[] subArray(int[] source, int start, int end)
	{
		// Edit this method

		return null; // Edit this line
	}

}
