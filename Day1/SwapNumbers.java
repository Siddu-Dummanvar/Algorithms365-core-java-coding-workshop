import java.util.Arrays;
import java.util.Scanner;

public class SwapNumbers {
    public static int[] getSwapNumbers(int var1, int var2)
    {
        int swapArr[] =new int[2];
        var1 = var1+var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        //System.out.println("var1 "+var1+" "+ "var2 "+var2);
        swapArr[0]=var1;
        swapArr[1]=var2;
        return swapArr;

    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number to swap");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int swappedNumbers[] =getSwapNumbers(num1, num2);
       
        System.out.println(Arrays.toString(swappedNumbers));
        sc.close();
    }
}
