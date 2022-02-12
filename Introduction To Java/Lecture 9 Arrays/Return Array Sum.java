import java.util.Scanner;
public class Solution {
	
	public static int sum(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            sum=sum+arr[i];
        }
         return sum;
    }
}