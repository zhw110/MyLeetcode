package cc150;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import cc5th.Q1;

@RunWith(Parameterized.class)
public class Q1Test
{

	private Q1 q1;

	@Before
	public void initialize()
	{
		q1 = new Q1();
	}

	@Parameter(0)
	public String fInput;

	@Parameter(1)
	public Boolean fExpected;

	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers()
	{
		return Arrays.asList(new Object[][] { //
				{ "abcde", true }, //
				{ "hello", false }, //
				{ "apple", false }, //
				{ "kite", true }, //
				{ "padle", true } //
		});
	}

	@Test
	public final void test()
	{
		Assert.assertEquals(fExpected, q1.isUniqueChars(fInput));
	}

}
