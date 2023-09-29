import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] lenArr = Arrays.stream(strArr).mapToInt(String::length).toArray();
        
        int[] answer = new int[lenArr.length];
        
        for (int i = 0; i < lenArr.length; i++) {
            for (int j : lenArr) {
                if (i == j) {
                    answer[i]++;
                }
            }
        }
        
        int ans = Arrays.stream(answer).max().getAsInt();
        return ans;
    }
}