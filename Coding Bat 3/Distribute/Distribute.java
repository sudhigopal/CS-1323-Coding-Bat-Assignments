import java.util.Arrays;
import java.util.Scanner;

public class Distribute
{

	public static void main(String[] args)
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);

		String line = keyboard.nextLine(); // get first array
		int[] first = convertStringToIntArray(line);

		line = keyboard.nextLine(); // get second array
		int[] second = convertStringToIntArray(line);

		int[] result = distribute(first, second);
		System.out.println("Result is: " + Arrays.toString(result));
	}

	// By making this a utility method, I'm able to call it twice and keep my main program
	// tidy.
	// You do not need to use this method
	public static int[] convertStringToIntArray(String line)
	{
		// Do not edit or use this method
		String[] split = line.split(" ");		// Split the String up using whitespace
		int[] first = new int[split.length]; 	// Construct the resulting array
		for (int i=0; i < first.length; ++i)	// Convert each String to an int and store in int array
		{
			first[i] = Integer.valueOf(split[i]);
		}
		return first;							// Return the reference to the newly constructed array
	}

	public static int[] distribute(int[] arr1, int[] arr2)
	{
		  // Construct the output array.
		  int[] output = new int[arr1.length * arr2.length];

		  // Loop over the elements of the first array.
		  for (int i = 0; i < arr1.length; ++i)
		  {
		    int elem = arr1[i];

		    // For each element of the first array, multiply it times the elements
		    // of the second and assign the result to the output array.
		    for (int j = 0; j < arr2.length; ++j)
		    {
		      output[i*arr2.length + j] = elem * arr2[j];
		    }
		  }

		  return output;
		}
	}
