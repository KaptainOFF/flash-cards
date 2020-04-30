import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] a = {9, 8, 3, 1, 5, 4};
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                a[i] += 1;
            } else if (a[i] < a.length) {
                a[i] += a[a[i]];
            }
        }
        System.out.println();
    }
}