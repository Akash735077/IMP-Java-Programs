
import java.util.Scanner;

public class Positive {
    
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        num=sc.nextInt();

        if(num>0){
            System.out.println(num+"is positive no.");

        }
        else{
            System.out.println(num+"is negative number");
        }
    }
}
