import java.util.Scanner;

public class ArraySum {
    static int getSum(int[] nums)
    {
        int sum=0;
        for(int num:nums)
        {
            sum=sum+num;

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int nums[]=new int[size];

        System.out.println("Start Entering the numbers");
        for(int i=0; i<size; i++)
        {
            nums[i]=sc.nextInt();
        }

        int sum = getSum(nums);
        System.out.println("Sum of the numbers of the array is "+sum);
        sc.close();
    }
}
