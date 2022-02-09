import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
       
        int sum=0;
        int pro=1;
        
        for(int i=1;i<=n;i++){
            sum=sum+i;
            pro=pro*i; 
        }
        if(c==1)
        System.out.println(sum);
        else if(c==2)
            System.out.println(pro);
        else
            System.out.println("-1");



	}
}
