public class Solution {
    
    public static void swapAlternate(int arr[]) {
        int n=arr.length;
        // if(n%2==0)
        // {
    	for(int i=0;i<n-1;i=i+2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            
        }}
}