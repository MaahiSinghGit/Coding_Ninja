public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        int largest=Integer.MIN_VALUE;
        int rowl=Integer.MIN_VALUE;
        int coll=Integer.MIN_VALUE;
        int row=mat.length;
          if(row==0){
            System.out.println("row "+row+" "+rowl);
        }
             else{
        int col=mat[0].length;
        int rows=0,cols=0;
        for(int i=0;i<row;i++){
            int rowsum=0;
            for(int j=0;j<col;j++){
                rowsum=rowsum+mat[i][j];
            }
            if(rowl<rowsum){
                rowl=rowsum;
                rows=i;
            }
        }
         for(int j=0;j<col;j++){
               int colsum=0;
         
             for(int i=0;i<row;i++){
                 colsum=colsum+mat[i][j];
             }
             if(coll<colsum){
                 coll=colsum;
                 cols=j;
             }
         }     
            if(rowl>=coll){
                System.out.println("row "+rows+" "+rowl);
            }
            else{
                System.out.println("column "+cols+" "+coll);
            }
        }
        }
}