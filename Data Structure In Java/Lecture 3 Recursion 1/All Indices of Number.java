public class Solution {

	public static int[] allIndexes(int[] arr,int num) {
		return allIndexes(arr, 0, arr.length-1, num);
	}
	public static int[] allIndexes(int[] arr,int start,int end,int num) {
		if(start > end) {
			return new int[0];
		}
		
		int[] smallAns=allIndexes(arr, start+1, end, num);
		if(arr[start]==num) {
			int[] ans=new int[smallAns.length+1];
			ans[0]=start;
			for(int i=0;i<smallAns.length;i++)
				ans[i+1]=smallAns[i];
			return ans;
		}
		return  smallAns;
	
	}
	
}