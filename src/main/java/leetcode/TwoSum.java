package leetcode;

public class TwoSum
{

	public int[] twoSum(final int[] nums, final int target)
	{
		int[] res = new int[2];// 3,2,4
		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = i + 1; j < nums.length; j++)// 1,2
			{
				if (nums[i] + nums[j] == target)
				{
					res[0] = i;
					res[1] = j;
				}
			}
		}
		return res;
	}

}
