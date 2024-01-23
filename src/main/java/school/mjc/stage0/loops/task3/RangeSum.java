package school.mjc.stage0.loops.task3;

public class RangeSum {
    public static void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum=0;/*вводим переменную, куда будем записывать сумму*/
        int n;
        for (n=firstBoarder;n<=secondBoarder;n++)
            sum +=n;/*sum=sum+n*/

        System.out.println(sum);
    }

    public static void main (String[]args)
        {int firstBoarder=1;
            int secondBoarder=10;
        printSumInclusive(firstBoarder, secondBoarder);}
}
