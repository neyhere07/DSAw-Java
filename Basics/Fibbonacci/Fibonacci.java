import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int te = b;
            b = b + a;
            a = te;
            count++;
        }
        System.out.println(b);
    }
}
