import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter the string ");
        String palindrome = sc.next().trim();

        if(Palindrome(palindrome))
            System.out.println("entered string is a palindrome");
        else
            System.out.println("not a palindrome ");


    }

    static boolean Palindrome(String name )
    {
        int start = 0 , end = name.length()-1;

        while( start < end) // for odd case middle char not checked , because it is single char
            // from left to right and right to left (first and last 2 char check - >  palindrome )
        {
            if (name.charAt(start) != name.charAt(end))
            {
                return false; // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }

        return true;
    }


}
