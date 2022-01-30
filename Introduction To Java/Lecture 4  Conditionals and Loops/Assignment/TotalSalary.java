import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Double i=sc.nextDouble();
        char g=sc.next().charAt(0);
        Double hra=(i/100)*20;
        Double da=(i/100)*50;
        Double pf=(i/100)*11;
        if(g=='A')
        {
            long a=1700;
            long x=Math.round(i+hra+da-pf+a);
            System.out.println(x);
        }
        else if(g=='B')
        {
            long b=1500;
            long x= Math.round(i+hra+da-pf+b);
            System.out.println(x);
        }
        else
        {
            long c=1300;
            long x=Math.round(i+hra+da-pf+c);
            System.out.println(x);
        }
        
	}
}
