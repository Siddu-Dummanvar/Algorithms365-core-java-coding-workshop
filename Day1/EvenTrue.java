import java.util.Arrays;
import java.util.Scanner;

public class EvenTrue {
     static boolean[] isEven(int[] nums)
    {
        boolean truefalse[] = new boolean[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==0)
            {
                truefalse[i]=true;
            }
            else
            {
                truefalse[i]=false;
            }
        }
        return truefalse;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        
        int nums[] =new int[size];
        
        System.out.println("Enter only numbers to chek is Ever or not");
        
        int index;
        for(index=0; index<nums.length; index++)
        {
            nums[index]=sc.nextInt();
        }
        boolean evenisEvenaluesArray[] =isEven(nums);
        System.out.println(Arrays.toString(evenisEvenaluesArray));
        sc.close();
    }
}
