package packageAdin;

import java.util.Scanner;

public class OurSuperPuperMegaClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("vvedit chislo");
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            if (k % i == 0) {
                System.out.println(i);
            }
        }
    }
}
