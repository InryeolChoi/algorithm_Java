package level1_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution2 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int arr[] = solution2.solution(3);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
