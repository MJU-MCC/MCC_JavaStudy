package ThreeWeek.JongSeok.Chapter4;

import java.util.Scanner;

public class ForFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if ( 1 <= N && N <= 100) {
            for (int i = 1; i <= N; i++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
