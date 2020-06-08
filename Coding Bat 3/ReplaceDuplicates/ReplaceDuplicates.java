import java.util.Arrays;
import java.util.Scanner;

public class ReplaceDuplicates
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String line = keyboard.nextLine();
		String[] input = line.split(" ");
		String word = keyboard.nextLine();

		System.out.println(Arrays.toString(replaceDuplicates(input, word)));
		keyboard.close();
	}

	public static String[] replaceDuplicates(String[] words, String replacement)
	{
		// Create a new array that is the same length as the original.
		String[] copy = new String[words.length];
		// Loop through the words in the array.
		for (int i = 0; i < words.length; ++i)
		{
			String word = words[i];
			// Use a boolean to track if a duplicate is found.
			boolean duplicateFound = false;
			// Compare the word to every other word.
			for (int j = 0; j < words.length; ++j)
			{
				String otherWord = words[j];
				// i != j ensures the word is not compared to itself.
				if (word.equals(otherWord) && i != j)
				{
				duplicateFound = true;
				}
			}

			// Assign the appropriate word to element i of the copy.
			if (duplicateFound) {
				copy[i] = replacement;
			}
			else
			{
				copy[i] = word;
			}
		}
		return copy;
	}
}
