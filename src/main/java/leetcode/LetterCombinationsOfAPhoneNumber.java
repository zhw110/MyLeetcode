package leetcode;

//http://blog.csdn.net/linhuanmars/article/details/19743197
import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber
{
	public ArrayList<String> letterCombinations(final String digits)
	{
		ArrayList<String> res = new ArrayList<String>();
		res.add("");
		if (digits == null || digits.length() == 0)
		{
			return res;
		}
		for (int i = 0; i < digits.length(); i++)
		{
			String letters = getLetters(digits.charAt(i));
			ArrayList<String> newRes = new ArrayList<String>();
			for (int j = 0; j < res.size(); j++)
			{
				for (int k = 0; k < letters.length(); k++)
				{
					newRes.add(res.get(j) + Character.toString(letters.charAt(k)));
				}
			}
			res = newRes;
		}
		return res;
	}

	private String getLetters(final char digit)
	{
		switch (digit)
		{
			case '2':
				return "abc";
			case '3':
				return "def";
			case '4':
				return "ghi";
			case '5':
				return "jkl";
			case '6':
				return "mno";
			case '7':
				return "pqrs";
			case '8':
				return "tuv";
			case '9':
				return "wxyz";
			case '0':
				return " ";
			default:
				return "";
		}
	}

}
