public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
       boolean b=true;
        if(input.length==0){
            b=false;
            return b;
        }
        if(input[0]==x){
            b=true;
            return b;
        }
        if(input.length==1){
            if(input[0]==x){
                b=true;
                // return b;   
            }
            else{
                b=false;
            } 
            return b;
        }
        
        int smallarr[]=new int[input.length-1];
        for(int i=0;i<input.length-2;i++){
            smallarr[i]=input[i+1];
        }
        
        b=checkNumber(smallarr, x);
        // b=false;
        return b;
	}
}