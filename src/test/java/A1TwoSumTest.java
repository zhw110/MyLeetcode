import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class A1TwoSumTest
{

	// private int[] inputNumber;
	// private int[] expectedResult;
	private A1TwoSum a1TwoSum;

	// static int[] nums = { 2, 7, 11, 15 };
	// static int[] nums1 = { 3, 2, 4 };
	//
	@Before
	public void initialize()
	{
		a1TwoSum = new A1TwoSum();
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
	// @Parameterized.Parameters
	// public static Collection primeNumbers()
	// {
	// return Arrays.asList(new Object[][] { //
	// { A1TwoSumTest.nums, 9, 9 }, //
	// { A1TwoSumTest.nums1, 6, 9 } });
	// }

	@Test
	public final void testTwoSum()
	{
		// 1 prepare data
		// int[] nums = { 2, 7, 11, 15 };// 3,2,4
		// int target = 9;// 6
		//
		// int[] actuals = { 0, 1 };// [1,2]

		int[] nums = { 3, 2, 4 };
		int target = 6;

		int[] expecteds = { 1, 2 };

		// 2 run
		int[] actuals = a1TwoSum.twoSum(nums, target);

		// 3 compare
		Assert.assertArrayEquals(expecteds, actuals);
	}

}
