import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int soe=0,soo=0;
        while(n!=0)
        {
            int temp=n%10;
            if(temp%2==0)
            {
                soe=soe+temp;
            }
            else{
                soo=soo+temp;
            }
        }
	    System.out.println(soe+" "+soo);
    
	

    }
}
