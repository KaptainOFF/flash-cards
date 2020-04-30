import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        boolean result = true;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if(!(numbers[i] < numbers[i+1])) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}