package leetcode;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class A1TwoSumTest
{

	// private int[] inputNumber;
	// private int[] expectedResult;
	private TwoSum a1TwoSum;

	// static int[] nums = { 2, 7, 11, 15 };
	// static int[] nums1 = { 3, 2, 4 };
	//
	@Before
	public void initialize()
	{
		a1TwoSum = new TwoSum();
	}

	//
	// // Each parameter should be placed as an argument here
	// // Every time runner triggers, it will pass the arguments
	// // from parameters we defined in primeNumbers() method
	//
	// public A1TwoSumTest(final int[] inputNumber, final int[] expectedResult)
	// {
	// this.inputNumber = inputNumber;
	// this.expectedResult = expectedResult;
	// }
	//
	@Parameterized.Parameters
	public static Collection primeNumbers()
	{
		return Arrays.asList(new int[][][] { //
				{ { 2, 7, 11, 15 }, { 9 }, { 0, 1 } }, //
				{ { 3, 2, 4 }, { 6 }, { 1, 2 } }

		});
	}

	@Parameter(0)
	public int[] fInput0;

	@Parameter(1)
	public int[] fInput1;

	@Parameter(2)
	public int[] fExpected;

	@Test
	public final void testTwoSum()
	{
		int[] actuals = a1TwoSum.twoSum(fInput0, fInput1[0]);

		Assert.assertArrayEquals(fExpected, actuals);
	}

}
