import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int aLen = a.length();
        
        if (1 <= aLen && aLen <= 1000000) {
            System.out.print(a);
        }
    }
}