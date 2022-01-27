import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
    
        
        while(s<=e)
        {
          int c=((s-32)*5)/9;
         System.out.print(s+" "+c+"\n");
            s=s+w;
        }

		
	}

}
