import java.util.Arrays;
import java.util.Scanner;

public class AppendPerfectSize 
{

	public static void main(String[] args) 
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);
		int[] array;
		int[] append;
		
		// Read in the first array--all data must be on one line for this trick to work
		String value = keyboard.nextLine();
		String[] input = value.split(" "); // will include -1 sentinel
		array = new int[input.length-1];
		for(int index=0; index<input.length-1; ++index)
		{
			array[index] = Integer.valueOf(input[index]); // convert String to int
		}
		
		// Read in the second array
		value = keyboard.nextLine();
		input = value.split(" "); // will include -1 sentinel
		append = new int[input.length-1]; // -1 to exclude sentinel
		for(int index=0; index<input.length-1; ++index)
		{
			append[index] = Integer.valueOf(input[index]); // convert String to int
		}
		
		int[] result = appendPerfectSize(array, append);
		System.out.println("Array contains " + Arrays.toString(result));
		keyboard.close();
	}
	
	public static int[] appendPerfectSize(int[] array, int[] toAppend) 
	{
		
		// Put your code here

		  
		  return null;  // edit this line

}
