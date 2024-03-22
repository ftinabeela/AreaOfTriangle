import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = inp.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();

        if(word.equals(sb.toString())){
            System.out.println("The sentence is a palindrome");

        }else{
             System.out.println("The sentence is not a palindrome");
        }





    }
}
