class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int result = 0;
            for (int j = 0; j < photo[i].length; j++) {
                for (int a = 0; a < name.length; a++) {
                    if (photo[i][j].equals(name[a])) {
                        result += yearning[a];
                    }
                }
                answer[i] = result;
            }
        }        
        
        return answer;
    }
}