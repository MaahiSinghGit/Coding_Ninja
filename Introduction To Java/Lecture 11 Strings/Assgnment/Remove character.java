public class Solution {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
        String rem="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                continue;
            }
            else{
                rem=rem+str.charAt(i);
            }
        }
        return rem;
	}

}