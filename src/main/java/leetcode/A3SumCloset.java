package leetcode;
//http://www.jiuzhang.com/solutions/3sum/

import java.util.ArrayList;
import java.util.Arrays;

public class A3SumCloset
{
	// * �������ɾ����㷨�༭�ṩ��û�а�Ȩ��ӭת����
	// * - �����㷨�����ڰ��������й����ҵ��õĹ�������ʦ�ŶӾ����Թ�Ⱥ͹��ڵ�һ�ߴ�˾��ְ����ʦ��
	// * - ���е�������ѵ�γ̰����������㷨�࣬ϵͳ��ư࣬����ǿ���࣬Java����������㷨�࣬
	// * - ������������ٷ���վ��http://www.jiuzhang.com/

	public class Solution
	{

		public ArrayList<ArrayList<Integer>> threeSum(final int[] num)
		{

			ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
			if (num == null || num.length < 3)
			{
				return rst;
			}
			Arrays.sort(num);
			for (int i = 0; i < num.length - 2; i++)
			{
				if (i != 0 && num[i] == num[i - 1])
				{
					continue; // to skip duplicate numbers; e.g [0,0,0,0]
				}

				int left = i + 1;
				int right = num.length - 1;
				while (left < right)
				{
					int sum = num[left] + num[right] + num[i];
					if (sum == 0)
					{
						ArrayList<Integer> tmp = new ArrayList<Integer>();
						tmp.add(num[i]);
						tmp.add(num[left]);
						tmp.add(num[right]);
						rst.add(tmp);
						left++;
						right--;
						while (left < right && num[left] == num[left - 1])
						{ // to skip duplicates
							left++;
						}
						while (left < right && num[right] == num[right + 1])
						{ // to skip duplicates
							right--;
						}
					}
					else if (sum < 0)
					{
						left++;
					}
					else
					{
						right--;
					}
				}
			}
			return rst;
		}
	}

}
