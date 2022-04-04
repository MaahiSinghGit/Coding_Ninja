public class solution {


    public static String[] keypad(int n){

        if(n==0)
        {
            String ans[] = {""};
            return ans;
        }

        String smallAns[] = keypad(n/10);
        char[] alpha = helper(n%10);

        String current[];
        
        if(n%10==7||n%10==9)
        {
            current =  new String[smallAns.length*4];
        }
        else
        {
            current =  new String[smallAns.length*3];
        }

        int k = 0;
        int i =0;
        while(i<current.length)
        {
            for(int j = 0;j<alpha.length;j++)
            {
                current[i]= smallAns[k] + alpha[j];
                i++;

            }
            k++;
            if(k==smallAns.length)
            {
                k=0;
            }
        }
        return current;

    }
