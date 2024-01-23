package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber > 0) {
            int sum = 0;
            int i;
            int p = 9;
            for (i = 1; i <= lengthOfLastNumber; i++) {
                sum += p;
                p = (p * 10) + 9;
            }
            System.out.println(sum);
        }

    else{
        System.out.println("0");
    }}
    public static void main(String[] args) {
        int lengthOfLastNumber = 7;
        calculateSum(lengthOfLastNumber);
    }
}