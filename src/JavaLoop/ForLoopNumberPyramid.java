package JavaLoop;
/**
 * Created by skrockybulhasanrasel 30/07/18.
 */
import java.util.Scanner;

public class ForLoopNumberPyramid {
    public static void main(String[] args) {

        System.out.println("Number Of Row :");
        Scanner noOfRow = new Scanner(System.in);
        int n = noOfRow.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.printf("%d", i);
            }
            System.out.println();
        }
    }
}
