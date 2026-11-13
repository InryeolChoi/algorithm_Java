package level1_0;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxcnt = 0;
        int mode = -1;
        boolean isDuplicate = false;

        for (int num : array) {
            int cnt = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, cnt);

            if (cnt > maxcnt) {
                maxcnt = cnt;
                mode = num;
                isDuplicate = false;
            } else if (cnt == maxcnt) {
                if (mode != num)
                    isDuplicate = true;
            }
        }

        if (isDuplicate == true)
            return -1;
        return mode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 3, 3, 4};
        System.out.println(solution.solution(arr));
    }
}
