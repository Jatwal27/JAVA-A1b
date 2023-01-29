import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter a word: ");
        char firstLetter = userIn.next().charAt(0);

        boolean isVowel = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(int index = 0; index < vowels.length; index++){
            if (vowels[index] == firstLetter) {
                isVowel = true;
            }
        }
        if (isVowel){
            System.out.print("  *      * \n");
            System.out.print("   *    *  \n");
            System.out.print("    *  *   \n");
            System.out.print("      *    \n");
        }else {
            System.out.print("    ****   \n");
            System.out.print("   *       \n");
            System.out.print("   *       \n");
            System.out.print("    ****   \n");
        }
    }
}