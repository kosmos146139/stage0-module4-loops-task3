package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1=1;
        int f2=0;
        System.out.println(f2);
        System.out.println(f1);
        for (int i = 2;i < lastFibonacci;i++)
        {
            System.out.println(f1 + f2);
            int buffer = f1;
            f1 = f2 + f1;
            f2 = buffer;


        }
    }
}
