import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       
       int t = scn.nextInt();

       for(int i=1;i<=t;i++){
         boolean isPrime=true;
         int x = scn.nextInt();
         int div=2;
         while (div*div<=x) {
           int rem = x%div;

           if(rem==0){
             isPrime=false;
             break;
           }
           div++;
         }

         if(isPrime==true){
           System.out.println("prime");
         }else{
           System.out.println("not prime");
         }
       }
  
   }
  }