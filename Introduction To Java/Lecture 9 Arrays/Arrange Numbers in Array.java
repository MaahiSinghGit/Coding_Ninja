public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int start=1;
        
        if(n%2==0){
            for(int i=0;i<(n/2);i++){
                arr[i]=start;
                start=start+2;
            }
            int end=n;
                for(int i=(n/2);i<n;i++){
                    arr[i]=end;
                    end=end-2;    
            }  
        }
        else{
            for(int i=0;i<=(n/2);i++){
                arr[i]=start;
                start=start+2;
            }
            int end=n-1;
                for(int i=(n/2)+1;i<n;i++){
                    arr[i]=end;
                    end=end-2;    
            }
            
                
        }
        // for(int i=0;i<n;i++){
        //         System.out.print(arr[i]+" ");
        //     }
    }
}