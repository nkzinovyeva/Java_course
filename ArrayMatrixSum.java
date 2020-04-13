

public class ArrayMatrixSum {

	public static void main(String[] args) {
		int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };

		int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };

		int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };

		int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };

		printSum(first, second);

		System.out.println();

		printSum(third, fourth);
	}

	private static void printSum(int first[][], int second[][]) {
		int row = first.length;
		int column = first[0].length;

		int sum[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum[i][j] = first[i][j] + second[i][j];
			}
		}

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.print(sum[r][c] + " ");
			}
			System.out.println();
		}
	}
}