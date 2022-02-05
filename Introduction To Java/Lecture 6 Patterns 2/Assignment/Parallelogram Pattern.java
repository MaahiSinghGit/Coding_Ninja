import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		//program to print Mirrored parallelogram star pattern


Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();	 
        String s="*";
 
	for(int i=1;i<=n;i++)
               {
	        for(int j=n-i+1;j<n;j++)
                
                        {
                               System.out.print(" ");
                        }
                       for(int j=1;j<=n;j++)
                
                        {
                               System.out.print(s);
                        }
                   
                            System.out.println();
                       
               }             
}
}

