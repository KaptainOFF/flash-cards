import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        // write your code here
        int value;
        if(val == null) {
            value = 0;
        } else if( val > Integer.MAX_VALUE) {
            value = Integer.MAX_VALUE;
        } else if (val < Integer.MIN_VALUE) {
            value = Integer.MIN_VALUE;
        } else {
            value = val.intValue();
        }
        return value;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}