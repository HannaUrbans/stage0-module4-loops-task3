package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t) {

        int sum = 0;
        int i = t;
        int lengthOfLastNumber = String.valueOf(i).length();
        for (i = Math.abs(t); lengthOfLastNumber != 0; lengthOfLastNumber--) {
            sum += i % 10;
            i /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int t = 243580001;
        printDigitsSum(t);
    }
}
