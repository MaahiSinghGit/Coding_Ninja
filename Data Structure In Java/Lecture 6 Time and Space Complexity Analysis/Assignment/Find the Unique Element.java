public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
         int res = 0; 
        int n=arr.length-1;
        for (int i = 0; i <= n ; i++) 
        { 
            res=res ^ arr[i]; 
        }
      
	
    return res;
	}
}