package Week1;

public class Warmup_B {
    public static int getSequenceAt(int n) {
        if (n < 1) {
            return -1;
        } else if(n == 1) {
            return 2;
        } else {
            int previousSequence = getSequenceAt(n -1);
            return 2 * previousSequence * previousSequence - 1;
        }
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(getSequenceAt(n));
    }
}
