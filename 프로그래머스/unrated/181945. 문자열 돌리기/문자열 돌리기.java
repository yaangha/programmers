import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] a = new String[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            a[i] = str.substring(i, i + 1);
        }
        
        for (String b : a) {
            System.out.print(b + "\n");
        }
    }
}