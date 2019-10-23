import java.util.Scanner;
/**
 * for_8
 */
public class for_8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum ;
        for(int i = 1 ; i <= n ; i++){
            for(int a = 1 ; a <= n ; a++ ){
                sum =  a * i ;
                System.out.print( sum + "\t");
            }
            System.out.println();
        }
    }
}
