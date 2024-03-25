package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int n = 0;
        int sum = 0;
        for (int i = 0; i < lengthOfLastNumber;i++)
        {
            if (lengthOfLastNumber < 0) {break;}
            n = n + (9 * (int)Math.pow(10,i));
            sum +=n;
        }
        System.out.println(sum);
    }
}
