package BitManipulation;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int result = 0;
        for(int i: A) {
            result ^= i;
        }
        return result;
    }
}
