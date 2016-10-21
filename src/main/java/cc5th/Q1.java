package cc5th;

/**
 * 1.1 Implement an algorithm to determine if a string has all unique characters. What if you cannot
 * use additional data structures?
 */
public class Q1
{

	public Boolean isUniqueChars(final String inputNumber)
	{
		// hello
		// 1 change into array
		String[] split = inputNumber.split("");

		// 2 check the same value
		for (int i = 0; i < split.length - 1; i++)
		{
			for (int j = i + 1; j < split.length; j++)
			{
				if (split[i].equals(split[j]))
				{
					return false;
				}
			}

		}
		return true;
	}

}
