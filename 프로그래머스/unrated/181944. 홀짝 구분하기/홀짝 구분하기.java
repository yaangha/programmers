import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // (1) if ~ else ~
        if(n % 2 == 0) {
            // System.out.print(n + " is even");
            System.out.printf("%d is even", n);
        } else {
            // System.out.print(n + " is odd");
            System.out.printf("%d is odd", n);
        }
        
        // (2) 삼항연산자
    }
}