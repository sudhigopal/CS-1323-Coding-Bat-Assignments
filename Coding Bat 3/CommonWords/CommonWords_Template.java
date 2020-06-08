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


		return 0; // Edit this line
	}

}
