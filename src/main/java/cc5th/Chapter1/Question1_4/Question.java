package cc5th.Chapter1.Question1_4;

import cc5th.CtCILibrary.CtCILibrary.AssortedMethods;;

public class Question
{
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(final char[] str, final int length)
	{
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < length; i++)
		{
			if (str[i] == ' ')
			{
				spaceCount++;
			}
		}
		index = length + spaceCount * 2;
		str[index] = '\0';
		for (i = length - 1; i >= 0; i--)
		{
			if (str[i] == ' ')
			{
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			}
			else
			{
				str[index - 1] = str[i];
				index--;
			}
		}
	}

	public static void main(final String[] args)
	{
		String str = "abc d e f";
		char[] arr = new char[str.length() + 3 * 2 + 1];
		for (int i = 0; i < str.length(); i++)
		{
			arr[i] = str.charAt(i);
		}
		Question.replaceSpaces(arr, str.length());
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
	}
}
