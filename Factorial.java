package com.crucerne.www.factorial;

public class Factorial {

	// Iterative approach to finding the factorial of a given number.
	public static long factorialIterative(int number)
	{
		// Throw exception if input number is less than zero.
		if (number < 1)
		{
			throw new IllegalArgumentException("Input value must be positive!");
		}
		
		long returnValue = 1L;
		
		// Keep multiplying the returnValue by "i" until it has reached the input value, "number".
		// until "number" is 
		for (int i = 1; i <= number; i++)
		{
			returnValue *= i;
		}
		
		return returnValue;
	}
	
	// Recursive approach to finding the factorial of a given number.
	public static long factorialRecursive(int number)
	{
		// Throw exception if input number is less than zero.
		if (number < 1)
		{
			throw new IllegalArgumentException("Input value must be positive!");
		}
		
		// Base cases of factorial 0 and 1.
		if (number == 1 || number == 0)
		{
			return 1;
		}
		
		return number * factorialRecursive(number - 1);
		
	}
	
}
