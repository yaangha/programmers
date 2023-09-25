import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        //int m = 1;
        //int nMinusM = 1;
        //int n = 1;
        BigInteger m = new BigInteger("1");
        BigInteger nMinusM = new BigInteger("1");
        BigInteger n = new BigInteger("1");
        for (int i = share; i > 0; i--) {
            m = m.multiply(BigInteger.valueOf(i));
        }
        
        for (int j = balls-share; j > 0; j--) {
            nMinusM = nMinusM.multiply(BigInteger.valueOf(j));
        }
        
        for (int k = balls; k > 0; k--) {
            n = n.multiply(BigInteger.valueOf(k));
        }
        
        int answer = n.divide((m.multiply(nMinusM))).intValue();
        return answer;
    }
}