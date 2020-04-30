import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] elements = new int[size];
        int sum = 0;

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
            sum += elements[i];
        }

        System.out.println(sum);
    }
}