import java.util.Scanner;
/**
 * for_3
 */
public class for_6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0 ;
        for( int i = 1 ; i <= n ; i ++ ){
            sum =sum + i*( i + 1 );
        }
    System.out.println(sum);
    }
}