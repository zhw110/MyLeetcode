package leetcode;

//http://blog.csdn.net/github_27609763/article/details/47662851
//题目：最长公共前缀
//Write a function to find the longest common prefix string amongst an array of strings.
//
//分析：题意找出所有字符串的最长公共前缀。 思路简单：如下步骤
//1. 找出字符串数组中字符串长度最小的字符串minStr
//2. minStr与其余的字符串逐个字符比较，确定最长公共前缀

public class LongestCommonPrefix
{
	public static void main(final String[] args)
	{
		String[] strs = new String[] { "aabd", "aabcd", "aaccs", "aa" };
		System.out
				.println("Longest Common Prefix: " + LongestCommonPrefix.longestCommonPrefix(strs));
		String[] strs1 = new String[] { "a", "b" };
		System.out.println(
				"Longest Common Prefix 1: " + LongestCommonPrefix.longestCommonPrefix(strs1));
		String[] strs2 = new String[] { "", "" };
		System.out.println(
				"Longest Common Prefix 2: " + LongestCommonPrefix.longestCommonPrefix(strs2));
		String[] strs3 = new String[] { "ssa", "ssab" };
		System.out.println(
				"Longest Common Prefix 3: " + LongestCommonPrefix.longestCommonPrefix(strs3));
		String[] strs4 = new String[] { "", "b" };
		System.out.println(
				"Longest Common Prefix 4: " + LongestCommonPrefix.longestCommonPrefix(strs4));
		String[] strs5 = new String[] { "leet", "left", "leave", "leat" };
		System.out.println(
				"Longest Common Prefix 5: " + LongestCommonPrefix.longestCommonPrefix(strs5));
	}

	public static String longestCommonPrefix(final String[] strs)
	{
		String minStr = "";
		int minLength = Integer.MAX_VALUE;

		if (strs.length == 1)
		{
			return strs[0];
		}
		else if (strs.length == 0)
		{
			return "";
		}
		// Find the smallest length
		for (int i = 0; i < strs.length; i++)
		{
			if (strs[i].length() < minLength)
			{
				minStr = strs[i];
				minLength = strs[i].length();
			}
		}

		for (int i = 0; i < strs.length; i++)
		{
			int j;
			for (j = 0; j < minLength; j++)
			{
				if (minStr.charAt(j) != strs[i].charAt(j))
				{
					break;
				}
			}
			if (j < minLength)
			{
				minLength = j;
			}
		}
		return minStr.substring(0, minLength);
	}
}