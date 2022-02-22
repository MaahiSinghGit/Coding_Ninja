public class Solution {

     public static String reverse(String str,int i,int j){
       String s="";
        for(int k=j;k>=i;k--){
            s+=str.charAt(k);
        }
        return s;
    }

	public static String reverseEachWord(String str) {
		
        int start=0;
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans+=reverse(str,start,i-1);
                ans+=" ";
                start=i+1;
            }
            if(i==str.length()-1){
                ans+=reverse(str,start,i);
            }
        }
        return ans;
	}