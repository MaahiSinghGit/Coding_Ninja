public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here

        if(s.length()==1){
            return s;
        }
        String ans="";
        String small=removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0)==small.charAt(0)){
            return small;
        }
        else{
            return s.charAt(0)+small;
        }
        // if(s.charAt)
        // if(s.charAt(0)!=s.charAt(1))
        // {
        //     ans=ans+s.charAt(0)+s.charAt(1);
        //      String small=removeConsecutiveDuplicates(s.substring(1));
        //     return ans;
        // }
        // else{
        //     ans=ans+s.charAt(0);
        //     return ans;
        // }
    }
}