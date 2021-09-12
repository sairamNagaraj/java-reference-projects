package in.co.cockatiel.leetcode.easy;

public class ReverseInteger {
    public int reverse(int x) {
        try {
            int xLength = Integer.toString(Math.abs(x)).length();
            int abs = 1;
            if (x < 0) {
                abs = -1;
                x = Math.abs(x);
                //System.out.println("Starting x = "+x);
            }
            long solution = 0;
            for (int i = xLength -1 ; i >= 0; i--) {
                long temp1 = (int) ((x % 10) * Math.pow(10.0d, (double) (i)));
                System.out.println("for "+i+" --- "+temp1);
                x = (int) (x / 10);
                //System.out.println("temp 1 = "+temp1+" ..... x = "+x);
                solution = solution + temp1;
                if(solution<-2147483648 || solution > 2147483647){
                    throw new Exception("Max range issue");
                }
                //System.out.println("Solution = "+solution);
            }
            return (int) solution * abs;
        } catch (Exception ex) {
            return 0;
        }

    }
}
