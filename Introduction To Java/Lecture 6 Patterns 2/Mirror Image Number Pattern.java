import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

          Scanner scr = new Scanner(System.in);
       int n = scr.nextInt();
       int i = 1;
       
       while( i<=n ){
           int Start = 1;
           int j =1;
           while( j <= n - i ){
               System.out.print(" ");
             j++;
           }
           while(j<=n){
               System.out.print(Start);
               Start++;
               j++;
           }
           System.out.println();
           i++;
       }
		
	}

}