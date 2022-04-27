public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
         int res = 0; 
        int n=arr.length-1;
        for (int i = 0; i < n ; i++) 
        { res = res ^ i;
            res=res ^ arr[i]; 
        }
        res = res ^ arr[n]; 
              
        return res;
	}
}