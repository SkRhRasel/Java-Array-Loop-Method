package JavaLoop;
/**
 * Created by skrockybulhasanrasel 30/07/18.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int t=9;
        int i =0;
        do {
            System.out.println(t + "x" + i + "=" + (t * i));
            i++;
        }while(i<=10);
    }
}
