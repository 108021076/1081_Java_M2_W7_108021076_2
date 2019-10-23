import java.util.Scanner;
/**
 * for_3
 */
public class for_4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float v1 = scn.nextFloat();
        float maxVal = v1 ;
        float minVal = v1 ;
        for(int i = 1 ; i < 10 ; i++ ){
            float v2 = scn.nextFloat();
            if( maxVal < v2 ){
                maxVal = v2 ;
            }else if( minVal > v2){
                minVal = v2 ;
            }
        }
        System.out.printf("Max = " + "%.2f\n",maxVal);
        System.out.printf("Mim = " + "%.2f\n",minVal);
    }
}