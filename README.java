import java.util.Scanner;

public class MyClass{

     public static void main(String []args){
         
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your input:");
        int num = in.nextInt();
        
        int leftOver = num%10;
        int takeAway = (num-leftOver)/10;
    
        System.out.println("sifrat hayehidot: " + leftOver);
        System.out.println("sifrat ha'asarot: " + takeAway);
     }
}
