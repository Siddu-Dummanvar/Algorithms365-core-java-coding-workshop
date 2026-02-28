import java.util.Arrays;
import java.util.Scanner;

public class Digit {
    static boolean[] isNumber(String[] input)
    {
        int length=input.length;
        boolean[] numberIsTrueOrFalse= new boolean[length];

        for(int count=0; count<length; count++)
        {
            boolean result=true;
            for(int index=0; index<input[count].length(); index++)
            {
                char character=input[count].charAt(index);
                if(character < '0' || character > '9')
                {
                    result=false;
                    break;
                }
                
            }
            numberIsTrueOrFalse[count]=result;
            
        }
        return numberIsTrueOrFalse;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        
        String str[] =new String[size];
        
        System.out.println("Enter Strings to check it is number or not");
        
        int index;
        for(index=0; index<str.length; index++)
        {
            str[index]=sc.next();
        }
        boolean isDigitArray[] =isNumber(str);
        System.out.println(Arrays.toString(isDigitArray));
        sc.close();


    }
}
