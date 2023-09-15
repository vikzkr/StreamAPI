package ds;

public class bs {

	public static void main(String[] args) {

		int[] array = { 2, 3, 4, 5, 6, 7 };

		int searchNode = BinarySearch(array, 5);
		System.out.println("Binary search " + searchNode);

	}

	private static int BinarySearch(int[] array, int value) {
		int start = 0;
		int end = array.length;
		int middle = (start + end) / 2;

		while (array[middle] != value) {
			if (array[middle] > value) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
			middle = (start + end) / 2;

		}

		return middle;
	}

}
