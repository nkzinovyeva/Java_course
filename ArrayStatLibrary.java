
import java.util.Arrays;

public class ArrayStatLibrary {

	public static int max(int array[]) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int array[]) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static double median(int array[]) {

		Arrays.sort(array);

		int leng = array.length;
		double median = 0;

		if ((leng % 2) != 0) {
			median = array[(leng - 1) / 2];
		} else {
			median = (array[leng / 2] + array[(leng / 2) - 1]) / 2 + 0.5;
		}

		return median;
	}

	public static double mean(int array[]) {

		double mean = 0;

		for (int i = 0; i < array.length; i++) {
			mean += array[i];
		}
		mean = mean / array.length;
		return mean;
	}

	public static double standardDeviation(int array[]) {

		double mean = ArrayStatLibrary.mean(array);
		double numerator = 0;
		double denominator = array.length - 1;
		double fraction = 0;
		double deviation = 0;

		for (int i = 0; i < array.length; i++) {
			double a = (array[i] - mean) * (array[i] - mean);
			numerator += a;
		}

		fraction = numerator / denominator;
		deviation = Math.sqrt(fraction);

		return deviation;
	}

}
