public class Solution {  

    public static void selectionSort(int[] arr) {
    	//Your code goes here
        for(int i=0;i<=arr.length-1;i++){
            int min=arr[i];
            int minindex=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minindex=j;
                }
            }
            arr[minindex]=arr[i];
            arr[i]=min;
        }
    }   

}