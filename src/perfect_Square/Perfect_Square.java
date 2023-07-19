package perfect_Square;

import java.util.Scanner;
/*
    Given a positive integer num, return true if num is a perfect square or false otherwise.
	A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
	You must not use any built-in library function, such as sqrt.
	
	Input: num = 16
	Output: true
	Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
	
	Input: num = 14
	Output: false
	Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
*/
public class Perfect_Square {
	
	private static boolean check_perfect_square(int n) {
		int i;
		for(i=1;i*i<n;i++)
		{
			
		}
		if(i*i==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(check_perfect_square(n));
	}
}
