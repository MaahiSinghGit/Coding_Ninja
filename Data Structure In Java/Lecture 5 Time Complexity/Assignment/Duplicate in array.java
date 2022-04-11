public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
         int val=0;
        for (int i=0;i<arr.length;i++)
        {
            val=val+arr[i];
        }
        return val-((arr.length-2)*(arr.length-1)/2);
	}
}