package Week1;

public class Warmup_B {
    public static double getSequenceAt(double n) {
        if (n < 1) {
            return -1;
        } else if(n == 1) {
            return 2;
        } else {
            double previousSequence = getSequenceAt(n -1);
            return 2 * previousSequence * previousSequence - 1;
        }
    }

    public static void main(String[] args) {
        double n = 15;
        System.out.println(getSequenceAt(n));
    }
}
