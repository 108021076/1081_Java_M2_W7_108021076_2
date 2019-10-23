import java.util.Scanner;
/**
 * for_3
 */
public class for_7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0 ; 
        for( int i = 0 ; i <= n ; i++){
            if( i % 2 == 0 && i % 3 == 0 || i % 3 == 0 && i % 5 == 0 || i % 2 == 0 && i % 5 == 0){
                sum = sum + i ;
                        System.out.println(sum);
            }
        }
    }
}