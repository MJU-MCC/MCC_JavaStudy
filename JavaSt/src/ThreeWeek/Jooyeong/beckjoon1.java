package ThreeWeek.Jooyeong;
import java.util.Scanner;
public class beckjoon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int star = scan.nextInt();

        for(int i=0; i<star; i++){
            for(int j=0; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }   
}
