import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = sc.nextLine();

        char [] letters = new char[word.length()];  //assign the word to array of char letters

        for(int i =0; i< word.length(); i++){

            char c = word.charAt(i);
            letters[i] = c;         //storing the word in char array
        }

        //reverse loop for printing the letters
        for(int j = word.length() - 1 ; j >= 0; j--){

            System.out.print(letters[j]);

        }


    }
}
