package level1_1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (i <= n) {
            list.add(i);
            i += 2;
        }

        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = solution.solution(5);
        Arrays.stream(arr).forEach(System.out::println);
    }
}