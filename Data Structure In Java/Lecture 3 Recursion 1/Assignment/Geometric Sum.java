public class solution {

	 public static double findGeometricSum(int k)
    {
        if(k==0)
            return 1;
        double smallans=findGeometricSum(k-1);
        return smallans+(1/Math.pow(2,k));



    }
}
