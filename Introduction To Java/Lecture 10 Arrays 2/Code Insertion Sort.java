public class Solution {  

    public static void insertionSort(int[] arr) {
    	//Your code goes here
        for(int i=1;i< arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
            }
        
    }

}