import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int n=x;
        int term=0;
        for(int i=1;i<=n;i++){
            term=(3*i)+2;
            if(term%4==0){
                n++;
            }
            else{            
                    System.out.print(term+" ");
                }
            
        }

	}
}
