public class Fibbonacci {

    public static void main(String[] args) {
       // number of terms
        int a = 0, b = 1;
        System.out.println("Fibonacci Series of first 10 numbers:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(a+" ");

          int sum = a + b;
          a = b;
          b = sum;
        }

      }
    }
    
    