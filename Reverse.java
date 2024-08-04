import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num:");
        int num=sc.nextInt();

        int rev=0,temp;
        while(num>0){
            temp =num%10;
            num=num/10;
            rev=rev*10+temp;
        }
        System.out.println(rev);

    }

}

