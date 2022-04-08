// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
return subsets(input, 0);
        
    }
    
    public static int[][] subsets(int input[], int start) {
        // Write your code here
        if (start == input.length) {
            int[][] myans = new int[1][0];
            return myans;
        }
        int cn = input[start];
        int[][] smallanswer = subsets(input, start + 1);
        int[][] myans = new int[2 * smallanswer.length][];
        int k = 0;
        
        for (int i = 0; i < smallanswer.length; i++) {
            myans[k] = new int[smallanswer[i].length];
            for (int j = 0; j < smallanswer[i].length; j++) {
                myans[k][j] = smallanswer[i][j];

            }
            k++;
        }
        for (int i = 0; i < smallanswer.length; i++) {
            myans[k] = new int[smallanswer[i].length + 1];
            myans[k][0]=cn;
            for (int j = 1; j <= smallanswer[i].length; j++) {
                myans[k][j] = smallanswer[i][j - 1];
            }
            k++;
        }
        
return myans;
	}
}
