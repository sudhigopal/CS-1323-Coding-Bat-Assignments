import java.util.Scanner;

public class RightTriangle 
{

	public static void main(String[] args) 
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);
		int firstSide = keyboard.nextInt();
		int secondSide = keyboard.nextInt();
		int thirdSide = keyboard.nextInt();
		
		System.out.println(isRightTriangle(firstSide, secondSide, thirdSide));
		keyboard.close();
	}
	
	public static boolean isRightTriangle(int first, int second, int third)
	{
	   // Your code goes here
	}

}