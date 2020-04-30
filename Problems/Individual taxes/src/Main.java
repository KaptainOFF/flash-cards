import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] incomeByCompany = new int[numberOfCompanies];
        int[] taxPercentage = new int[numberOfCompanies];
        int indexOfCompany = 0;
        int highestTax = 0;

        for (int i = 0; i < incomeByCompany.length; i++) {
            incomeByCompany[i] = scanner.nextInt();
        }

        for (int i = 0; i < taxPercentage.length; i++) {
            taxPercentage[i] = scanner.nextInt();
        }

        for (int i = 0; i < incomeByCompany.length; i++) {
            int tax = incomeByCompany[i] * taxPercentage[i];
            if(tax > highestTax) {
                highestTax = tax;
                indexOfCompany = i;
            }
        }
        System.out.println(indexOfCompany + 1);

    }
}