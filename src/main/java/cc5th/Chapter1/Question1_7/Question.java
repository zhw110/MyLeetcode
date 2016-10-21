package cc5th.Chapter1.Question1_7;

import cc5th.CtCILibrary.CtCILibrary.AssortedMethods;;

public class Question
{
	public static void nullifyRow(final int[][] matrix, final int row)
	{
		for (int j = 0; j < matrix[0].length; j++)
		{
			matrix[row][j] = 0;
		}
	}

	public static void nullifyColumn(final int[][] matrix, final int col)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			matrix[i][col] = 0;
		}
	}

	public static void setZeros2(final int[][] matrix)
	{
		boolean rowHasZero = false;
		boolean colHasZero = false;

		// Check if first row has a zero
		for (int j = 0; j < matrix[0].length; j++)
		{
			if (matrix[0][j] == 0)
			{
				rowHasZero = true;
				break;
			}
		}

		// Check if first column has a zero
		for (int i = 0; i < matrix.length; i++)
		{
			if (matrix[i][0] == 0)
			{
				colHasZero = true;
				break;
			}
		}

		// Check for zeros in the rest of the array
		for (int i = 1; i < matrix.length; i++)
		{
			for (int j = 1; j < matrix[0].length; j++)
			{
				if (matrix[i][j] == 0)
				{
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// Nullify rows based on values in first column
		for (int i = 1; i < matrix.length; i++)
		{
			if (matrix[i][0] == 0)
			{
				Question.nullifyRow(matrix, i);
			}
		}

		// Nullify columns based on values in first row
		for (int j = 1; j < matrix[0].length; j++)
		{
			if (matrix[0][j] == 0)
			{
				Question.nullifyColumn(matrix, j);
			}
		}

		// Nullify first row
		if (rowHasZero)
		{
			Question.nullifyRow(matrix, 0);
		}

		// Nullify first column
		if (colHasZero)
		{
			Question.nullifyColumn(matrix, 0);
		}
	}

	public static void setZeros(final int[][] matrix)
	{
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		// Store the row and column index with value 0
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if (matrix[i][j] == 0)
				{
					row[i] = true;
					column[j] = true;
				}
			}
		}

		// Nullify rows
		for (int i = 0; i < row.length; i++)
		{
			if (row[i])
			{
				Question.nullifyRow(matrix, i);
			}
		}

		// Nullify columns
		for (int j = 0; j < column.length; j++)
		{
			if (column[j])
			{
				Question.nullifyColumn(matrix, j);
			}
		}
	}

	public static boolean matricesAreEqual(final int[][] m1, final int[][] m2)
	{
		if (m1.length != m2.length || m1[0].length != m2[0].length)
		{
			return false;
		}

		for (int k = 0; k < m1.length; k++)
		{
			for (int j = 0; j < m1[0].length; j++)
			{
				if (m1[k][j] != m2[k][j])
				{
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] cloneMatrix(final int[][] matrix)
	{
		int[][] c = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				c[i][j] = matrix[i][j];
			}
		}
		return c;
	}

	public static void main(final String[] args)
	{
		int nrows = 10;
		int ncols = 15;
		int[][] matrix1 = AssortedMethods.randomMatrix(nrows, ncols, 0, 100);
		int[][] matrix2 = Question.cloneMatrix(matrix1);

		AssortedMethods.printMatrix(matrix1);

		Question.setZeros(matrix1);
		Question.setZeros2(matrix2);

		System.out.println();

		AssortedMethods.printMatrix(matrix1);
		System.out.println();
		AssortedMethods.printMatrix(matrix2);

		if (Question.matricesAreEqual(matrix1, matrix2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}
