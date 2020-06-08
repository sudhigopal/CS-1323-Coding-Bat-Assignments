import java.util.Scanner;

public class CommonWords
{

	public static void main(String[] args)
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);

		String line = keyboard.nextLine();
		String[] first = line.split(" ");
		line = keyboard.next();
		String[] second = line.split(" ");

		System.out.println(commonWords(first, second));

		keyboard.close();
	}

	public static int commonWords(String[] words1, String[] words2)
	{
		// Edit this method

		  // Initialize an accumulator to track the number of common words.
		  int numCommon = 0;

		  // Loop through the words in words1.
		  for (int m = 0; m < words1.length; ++m) {

		    String word1 = words1[m];

		    // For each word in words1, compare it to every word in words2.
		    for (int n = 0; n < words2.length; ++n) {

		      String word2 = words2[n];

		      // Increment the accumulator if the words are the same.
		      if (word1.equals(word2)) {
		        numCommon += 1;
		      }
		    }
		  }

	  return numCommon;
	}

}
