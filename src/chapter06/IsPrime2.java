package chapter06;

public class IsPrime2 {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        System.out.println("factors:" + factors);
        System.out.println(factors == 0);
    }
}