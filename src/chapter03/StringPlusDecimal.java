package chapter03;

public class StringPlusDecimal {
    public static void main(String[] args) {
        String val1 = "1.11111111";
        String val2 = "2.11111111";
        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(result2);
    }
}