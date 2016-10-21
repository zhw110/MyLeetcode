package cc5th.Chapter1.Question1_1;

public class Question
{

	public static boolean isUniqueChars(final String str)
	{
		if (str.length() > 128)
		{
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
			{
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

	public static boolean isUniqueChars2(final String str)
	{
		if (str.length() > 128)
		{
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if (char_set[val])
			{
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	public static void main(final String[] args)
	{
		String[] words = { "abcde", "hello", "apple", "kite", "padle" };
		for (String word : words)
		{
			System.out.println(word + ": " + Question.isUniqueChars(word) + " "
					+ Question.isUniqueChars2(word));
		}
	}

}
