
import java.util.Scanner;

public class Sumof {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num:");
        int num=sc.nextInt();

        int sum=0,temp;
        while(num>0){
            temp =num%10;
            num=num/10;
            sum=sum+temp;
        }
        System.out.println(sum);

    }

}

