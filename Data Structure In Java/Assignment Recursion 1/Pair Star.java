public class solution {

	// Return the updated string
	 public static String addStars(String s) {
        // Write your code here
        if(s.length()==1)
            return s;
        String smallans=addStars(s.substring(1));
        if(s.charAt(0)==smallans.charAt(0))
            return s.charAt(0)+"*"+smallans;
        else
            return s.charAt(0)+smallans;
        

    }
}
