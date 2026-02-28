import java.util.Scanner;

public class Sum
{
    static int getSum(int num1, int num2)
    {
        
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number to calculate sum");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum=getSum(num1, num2);
        System.out.println("Sum =" + sum);
        sc.close();
    }
}
