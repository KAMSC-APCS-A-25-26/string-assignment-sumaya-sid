import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // TODO: Create a Scanner and read a full line from the user with nextLine().
        //       Keep the original input string so you can print it in the final message.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = sc.nextLine();

        // TODO: Build a lowercase version of the input for checking (case-insensitive comparison).
        //       (You don't need to remove spaces/punctuation for the current tests.)

        // TODO: Determine whether the lowercase string reads the same forwards and backwards.
        //       Tip: compare it to a reversed copy of itself.
        StringBuilder sb = new StringBuilder(word2);
        String reverse = sb.reverse().toString();

        // TODO: Treat single-character inputs as palindromes (the above check will already handle this).
        if (word2.equals(reverse) == true)
        {
            System.out.println(word + " is a palindrome!");
        }
        else if (word2.equals(reverse) == false)
        {
            System.out.println(word + " is NOT a palindrome.");
        }

        // TODO: Print EXACTLY ONE of the following lines (no extra punctuation/labels):
        //       "<original> is a palindrome"
        //       "<original> is not a palindrome"
        //       where <original> is exactly what the user typed (preserve casing).
    }
}