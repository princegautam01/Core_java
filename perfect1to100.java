public class perfect1to100{

   public static void main(String [] args)
{

    for(int a = 1 ; a<=100 ; a++)
      {

          int total = 0;

        for(int i = 1 ; i < a; i++)
         {
      
            if(a%i==0)
             {
  
             total = total +  i;
             
             }
           
           


         }


         if(total==a)
             {

              System.out.println(a);
             
             }



      }





 }

}