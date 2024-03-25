package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t)
    {
        String str= Integer.toString(t);
        int sum = 0;
        for (int i = 0;i < str.length();i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                String s = Character.toString(str.charAt(i));
                int a = Integer.parseInt(s);
                sum += a;
            }
        }
        System.out.println(sum);

    }
}
