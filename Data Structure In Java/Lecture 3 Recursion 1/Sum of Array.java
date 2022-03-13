public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int i=input.length;
        int x=0;
        if(i==0){
            return 0;
        }
        int sum=input[x]+sum(input[x+1]);
        return sum;
		
	}
    
}