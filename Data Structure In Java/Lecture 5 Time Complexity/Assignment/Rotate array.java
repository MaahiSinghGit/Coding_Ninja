
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	 if (d>0)
        {
            d=d%(arr.length);
        	int[] temp=new int[d];
        	for (int i=0;i<d;i++)
        	{
            	temp[i]=arr[i];
                //System.out.print(temp[i]+" ");
        	}
            
            //System.out.println();
            
        	for (int i=0,j=0;i<arr.length&&j<d;i++)
        	{
        		if (i>=(arr.length-d))
                {
                    arr[i]=temp[j];
                    j++;
                }
                else
                {
                    arr[i]=arr[(i+d)%arr.length];
                }
        	}
        }
    }

}