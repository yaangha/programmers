import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[i].toUpperCase())) {
                sb.append(arr[i].toLowerCase());
            } else {
                sb.append(arr[i].toUpperCase());
            }
        }
        
        System.out.print(sb.toString());
        
    }
}