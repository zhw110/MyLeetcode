package cc5th.Introduction.SwapMinMax;

import cc5th.CtCILibrary.CtCILibrary.AssortedMethods;

public class SwapMinMax
{

	public static int getMinIndex(final int[] array)
	{
		int minIndex = 0;
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < array[minIndex])
			{
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static int getMaxIndex(final int[] array)
	{
		int maxIndex = 0;
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > array[maxIndex])
			{
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void swap(final int[] array, final int m, final int n)
	{
		int temp = array[m];
		array[m] = array[n];
		array[n] = temp;
	}

	public static void swapMinMaxBetter(final int[] array)
	{
		int minIndex = SwapMinMax.getMinIndex(array);
		int maxIndex = SwapMinMax.getMaxIndex(array);
		SwapMinMax.swap(array, minIndex, maxIndex);
	}

	public static void swapMinMax(final int[] array)
	{
		int minIndex = 0;
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < array[minIndex])
			{
				minIndex = i;
			}
		}

		int maxIndex = 0;
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > array[maxIndex])
			{
				maxIndex = i;
			}
		}

		int temp = array[minIndex];
		array[minIndex] = array[maxIndex];
		array[maxIndex] = temp;
	}

	public static void main(final String[] args)
	{
		int[] array = AssortedMethods.randomArray(10, -10, 10);
		System.out.println(AssortedMethods.arrayToString(array));
		SwapMinMax.swapMinMaxBetter(array);
		System.out.println(AssortedMethods.arrayToString(array));
	}

}
