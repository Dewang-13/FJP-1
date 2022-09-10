import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        
        int rem = x%2;
        
        if(rem==0){
            System.out.println(x+ "is even");
        }else{
            System.out.println(x + "is odd")
        }
    }
}