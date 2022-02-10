public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
       int a = 0;
        int b = 1;
        
        while(a<n){
            int c = a+b;
            a=b;
            b=c;
            
            
        }
        if(n==a)
        {
            return true;
        }
        else
            return false;

	
    }
}
