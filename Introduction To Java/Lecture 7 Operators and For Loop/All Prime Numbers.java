import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=2;i<=n;i++){
            boolean div=false;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    div=true;
                    break;
                }
                
            }
            if(div==false){
                System.out.println(i);
            }
        }	
	}
}
