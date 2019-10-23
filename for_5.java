import java.util.Scanner;
/**
 * for_3
 */
public class for_5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean flag = true ;
        int m = n/2 ;
        for( int i = 2 ; i <= m ; i++ ){
            if( n % i == 0 ){
                flag = false ;
                break;
            }
        }
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}