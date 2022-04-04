public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        if(input.length()==0){
            return input;
        }
        String ans="";
        if(input.charAt(0)==c1){
            ans=ans+c2;
        }
        else{
            ans=ans+input.charAt(0);
        }
        String small=(input.substring(1));
        return ans+small;

	}
}
