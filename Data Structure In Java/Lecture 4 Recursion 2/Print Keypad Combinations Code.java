public class solution {

	
   public static String dial(int n)
    {
     switch(n)
     {
        case 2:	return "abc";
         		
        case 3:	return "def";
         		
        case 4:	return "ghi";
         	
        case 5:	return "jkl";
         	
        case 6:	return "mno";
         	
        case 7:	return "pqrs";
         	
        case 8:	return "tuv";
			
        case 9:	return "wxyz";
        
       default:break;
     }
     return ""; 
    }
  

    
  	
  	
      public static   void pK(int num,String out)
      {
    
   		 if(num==0)
         {
     	  System.out.println(out);
   	    	 return;
    	}
          
    String pd=dial(num%10);
    for(int i=0;i<pd.length();i++)
    {
        pK(num/10,pd.charAt(i)+out);
    }
}
   
    
    
    
    
    public static void printKeypad(int input){
		// Write your code here	// Write your code here
         pK(input,"");
		
	}
    
    

 
    
}