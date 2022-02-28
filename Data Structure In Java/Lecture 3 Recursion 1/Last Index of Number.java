public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return lastIndex(input,x, input.length -1);
	}
    public static int lastIndex(int input[], int x,int startIndex){
        if(startIndex < 0) { // base case
            
			return -1;
		}
		if(input[startIndex] == x) {
			return startIndex;
		}
		return lastIndex(input ,x ,startIndex-1);
		//return ans;
        
//         if(startIndex==input.length-1){
//             return -1;
//         }
//         if(x==input[startIndex])
//         {
//             int arr[]=new int [input.length];
//             for(int i=0;i<input.length;i++){
//                 arr[i]=startIndex;
//             }
//             int lar=0;
//             for(int j=0;j<input.length;j++){
//                 if(lar<=arr[j]){
//                     lar=arr[j];
//                 }
                
//             }
//             return lar;
        
//         }
         
     //   return lastIndex(input,x,startIndex+1);
    }
	
}