/**
 * CodeReuse class contains methods for various operations like sorting, statistics calculation, and matrix addition.
 */
public class CodeReuse {

  /**
   * Sorts an array of integers in ascending order.
   * @param arr The array to be sorted.
   */
  public static void sortAscending(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // Swap arr[j] and arr[j+1]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  /**
   * Calculates maximum, minimum, and average of an array of integers.
   * @param arr The input array to calculate statistics.
   * @return An array of doubles containing maximum, minimum, and average values.
   */
  public static double[] calculateStats(int[] arr) {
    double[] stats = new double[3];
    if (arr.length == 0) {
      return stats; // Return zeros if the array is empty
    }

    int max = arr[0];
    int min = arr[0];
    double sum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i]; // Update maximum value if found
      }
      if (arr[i] < min) {
        min = arr[i]; // Update minimum value if found
      }
      sum += arr[i]; // Calculate sum of elements
    }

    stats[0] = max; // Maximum value
    stats[1] = min; // Minimum value
    stats[2] = sum / arr.length; // Average value

    return stats;
  }

  /**
   * Adds two matrices and returns the resultant matrix.
   * @param matrixA The first matrix.
   * @param matrixB The second matrix.
   * @param rows The number of rows in the matrices.
   * @param columns The number of columns in the matrices.
   * @return The resultant matrix after addition.
   */
  public static int[][] matrixAddition(
    int[][] matrixA,
    int[][] matrixB,
    int rows,
    int columns
  ) {
    int[][] resultMatrix = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
      }
    }

    return resultMatrix;
  }
}
