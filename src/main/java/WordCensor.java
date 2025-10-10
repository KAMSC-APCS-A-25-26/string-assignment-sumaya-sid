import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        String newSentence = sentence.replaceAll("dang", "***");
        String newSentence1 = newSentence.replaceAll("nuts", "***");
        String newSentence2 = newSentence1.replaceAll("oops", "***");
        String newSentence3 = newSentence2.replaceAll("yikes", "***");

        System.out.println("Censored: " + newSentence3);

        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
    }
}
