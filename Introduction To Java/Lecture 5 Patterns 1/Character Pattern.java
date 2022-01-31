import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
         Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        
        while( i<= n ){
            int j = 1;
           int  Start = 'A'+i-1;
            while(j<= i){
                System.out.print((char)(Start));
                j++;
               Start++;
            }
            System.out.println();
            i++;
        }
		
	}

}