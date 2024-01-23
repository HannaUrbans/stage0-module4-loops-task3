package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {
        int a = 1; /*контейнер, куда будем класть делители*/
        int i; /*счетчик*/
        if (first==0)
        {a=second;}
        else if (second==0 || second==first)
        {a=first;}
        else {
        for (i=1;i<first&&i<second;i++)
            if (first%i==0 && second%i==0)
            {a=i;}}

        System.out.println(a);
    }


public static void main(String[] args) {
    int first = 18;
    int second = 24;
    printGCD(first, second);
}

}
