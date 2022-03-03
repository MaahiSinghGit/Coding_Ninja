public class Solution {

	public static void print(int n){
        for(int i=0;i<=n;i++){
		if(n == 1){
			System.out.print(n + " ");
		}
		System.out.print(n+" ");
		print(n - 1);
	}
    }

}