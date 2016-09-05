/**
 * Created by jc321443 on 5/09/16.
 */
public class ArrayMethodDemo {
    public static void main(String []args){
        System.out.println();
        int[]  tenNumbers = {4,8,15,16,32,6,7,8,9};
        int l=12;
        method1(tenNumbers);
        reverseDisplay(tenNumbers);
        displaySum(tenNumbers);
        displayLessThan(tenNumbers, l);
        displayAverage(tenNumbers);
    }

    private static void reverseDisplay(int[] tenNumbers) {
        int i = 0;
        for (i = tenNumbers.length - 1; i >= 0; i--)
            System.out.print("" + tenNumbers[i] + "  ");
        System.out.println();
    }

    public static void method1(int[] tenNumbers){
        int i=0;
        for (i = 0; i < tenNumbers.length; i++)
            System.out.print(tenNumbers[i] + "  ");
        System.out.println();

    }
    public static void displaySum(int[] numbers)
    {
        int total = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            total += numbers[i];
        }
        System.out.println("\nThe sum of all numbers is " + total);
    }
    public static void displayLessThan(int[] numbers, int limit)
    {
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] < limit)
                System.out.print(numbers[i] + " ");
        System.out.println("are less than the limit " + limit);

    }
    public static void displayAverage(int[] numbers)
    {
        int sum = 0;
        double average;
        for(int i = 0; i < numbers.length; ++i)
            sum += numbers[i];
        average = sum * 1.0 / numbers.length;
        System.out.println("The average is " + average);
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] > average)
                System.out.print(numbers[i] + "  ");
        System.out.println("are greater than the average");
    }
}


