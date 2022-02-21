public class Solution {

	public static char highestOccuringChar(String str1) {
    int ctr[] = new int[256];
      int l = str1.length();
      for (int i = 0; i < l; i++)
       ctr[str1.charAt(i)]++;
      int max = -1;
      char result = ' ';

      for (int i = 0; i < l; i++) {
       if (max < ctr[str1.charAt(i)]) {
        max = ctr[str1.charAt(i)];
        result = str1.charAt(i);
       }
      }

      return result;
	}

}