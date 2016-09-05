/**
 * Created by jc321443 on 5/09/16.
 */
public class TwelveInts {
    public static void main(String []args){
        int[]  twelveNumbers = {1,2,3,4,5,6,7,8,9,10,11};
        int i = 0;
        for (i = 0; i < twelveNumbers.length; i++)
            System.out.print(twelveNumbers[i] + "  ");
        System.out.println();
        for (i = twelveNumbers.length - 1; i >= 0; i--)
            System.out.print("" + twelveNumbers[i] + "  ");
        System.out.println();

    }
}
