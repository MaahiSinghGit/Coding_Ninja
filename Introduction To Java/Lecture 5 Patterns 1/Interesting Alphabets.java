import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
         Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       int i;
	for (i=n;i>=1;i--) {
         int j = i;
           int  Start = 'A'+i-1;
            while(j<= n){
                System.out.print((char)(Start));
                j++;
               Start++;
            }
		System.out.println();
	}
		
	}

}