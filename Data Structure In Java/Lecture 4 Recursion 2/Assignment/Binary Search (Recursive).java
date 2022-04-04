public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here
 return binarySearch(input, element, 0, input.length - 1);

}
     public static int binarySearch(int[] input, int element, int start, int end) {

        int mid = (end + start) / 2;
        if (start >= end) {
            return -1;
        }
        if (input[mid] == element) {
            return mid;

        }
        if (element > input[mid]) {
            return binarySearch(input, element, mid + 1, end);
        }
        return binarySearch(input, element, start, mid - 1);

	}
}
