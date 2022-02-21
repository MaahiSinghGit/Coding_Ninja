public class Solution {

	public static boolean isPermutation(String input1, String input2) {
		//Your code goes here
        boolean check=false;
        if (input1.length() == input2.length())
        {
            int count1=0,count2=0;
            for (int i=0;i<input1.length();i++)
            {
                count1+=input1.charAt(i);
                count2+=input2.charAt(i);
            }
            
            if (count1 == count2)
            {
                check=true;
            }
        }
        return check;
    }

}