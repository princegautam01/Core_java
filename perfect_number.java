import java.util.*;
public class perfect_number{

   public static void main(String [] args){

      //int a = 7;
      //int total = 0;
      // taking input from user
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a Number: ");
      int a = s.nextInt();
      int total = 0;
      
      for(int i = 1; i<6;i++){
     
          if(a%i==0){
            
              total = total + i;
     
          }
        
          
    
        



       }

       if(total==a){
              System.out.println("Perfect Number");

          }
       else{
              System.out.println("Not Perfect Number");

        }



     }



}