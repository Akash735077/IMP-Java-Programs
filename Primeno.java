
import java.util.Scanner;

public class Primeno{
    public static void main(String[] args) {

        
        int count=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num+"the no. is prime");
        }
        else{
            System.out.println(num+"the no. is not prime");
        }

        }
}
/* 
public class Primeno{
    public static void main(String[] args) {
        int num=17;
        int count=0;
        for(int i=1; i<=num;i++){
            if(num%i==0){
                count++;

            }
        }
        if(count==2){
            System.out.println("prime no.");
        }
        else{
            System.out.println("not prime");
        }
    }
}
*/
