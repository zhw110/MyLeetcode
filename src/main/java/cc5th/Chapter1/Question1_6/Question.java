package cc5th.Chapter1.Question1_6;

import cc5th.CtCILibrary.CtCILibrary.AssortedMethods;

public class Question
{

	public static void rotate(final int[][] matrix, final int n)
	{
		for (int layer = 0; layer < n / 2; ++layer)
		{
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; ++i)
			{
				int offset = i - first;
				int top = matrix[first][i]; // save top

				// left -> top
				matrix[first][i] = matrix[last - offset][first];

				// bottom -> left
				matrix[last - offset][first] = matrix[last][last - offset];

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
	}

	public static void main(final String[] args)
	{
		int[][] matrix = AssortedMethods.randomMatrix(10, 10, 0, 9);
		AssortedMethods.printMatrix(matrix);
		Question.rotate(matrix, 10);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

}
