package homework.h04;

public class T1 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
