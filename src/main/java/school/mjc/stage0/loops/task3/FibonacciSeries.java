package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {
        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.println(n0);
        System.out.println(n1);
        for(int i = 3; i <= lastFibonacci; i++){
            n2=n0+n1;
            System.out.println(n2);
            n0=n1;
            n1=n2;
        }
    }
    public static void main (String[]args)
    {int lastFibonacci=5;
    printFibonacci(lastFibonacci);}
}
