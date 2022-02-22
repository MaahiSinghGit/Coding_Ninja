public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        if(str.length()<=1){
            return str;
        }
        String output="";
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                continue;
            }
            output=output+str.charAt(i-1);
//             for(int j=i+1;j<str.length();j++){
//                 if(str.charAt(i)==str.charAt(j)){
//                     i++;
//                 }
                
//             }
        }
        output=output+str.charAt(str.length()-1);
        return output;
        
	}

}