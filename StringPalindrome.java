//This program checks if a String is a Palindrome or Not in Java

import java.util.Scanner;
public class StringPalindrome {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String str = sc.nextLine();
        sc.close();
        int start = 0;
        int end = str.length()-1;
        boolean isPal = true;
        while(start < end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                isPal = false; 
                break;
            }
            start++;
            end--;
        }
        if(isPal == true)
        {
            System.out.println("It's a Palindrome");
        }
        else
        {
            System.out.println("It's not a Palindrome");
        }
    }
}