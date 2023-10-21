class Solution {
    public int solution(int[] common) {
        boolean result = common[2] - common[1] == common[1] - common[0];
        
        if (result) { // 등차
            return common[common.length-1] + common[1] - common[0];
        } else { // 등비
            return common[common.length-1] * (common[1] / common[0]);
        }
    }
}