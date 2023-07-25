import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //(1) println
        // System.out.print(a + " + " + b + " = " + (a + b));
        
        //(2) printf
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}