import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(String word)
    {
        boolean palindrome = true;
        int leftIndex = 0;
        int rightIndex = word.length()-1;

        while(leftIndex < rightIndex)
        {
            if(word.charAt(leftIndex)!=word.charAt(rightIndex))
            {
                palindrome = false;
                break;
            }
            else
            {
                leftIndex++;
                rightIndex--;
            }
        
        }
        return palindrome;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check the given string is palindrome or not");
        String word = sc.next();
        sc.close();

        boolean ans = checkPalindrome(word);
        if(ans == true)
        {
            System.out.println("The given String is palindrome");
        }
        else
        {
            System.out.println("The given String is not palindrome");
        }
    }
}
