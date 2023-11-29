public class factor_sum{

  public static void main(String[] args){

      int a = 6;
      int total = 0;
      
      for(int i = 1;i<=a;i++){

          if(a%i==0){

            
             // System.out.println(i);
             total = total + i;  

              
            }
         


       }
  
     System.out.println(total);
      



   }



}