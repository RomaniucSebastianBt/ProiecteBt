import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // this will accepts the words for the hash trie
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println(
                "creeaza cuvintele dorite pe rand si spatiate :");

        //  read the line and provide with space separated words
        String input = br.readLine();

        //  split all the words and store them in the string array
        String[] c = input.split(" ");

        //  constructor with string // array as parameter and  pass the user entered string in that constructor
        TrieHash trie = new TrieHash(c);
        System.out.println(
                "Cate cuvinte trebuie cautate?");
        String count = br.readLine();
        int counts = Integer.parseInt(count);


        for (int i = 0; i < counts; i++) {
            System.out.println(
                    "\nCauta cuvintele unul cate unul : ");
            String word = br.readLine();

            // this will search for the word in out trie
            if (trie.search(word)) {
                System.out.println(
                        "Cuvant gasit in Trie");
            }
            else {
                System.out.println(
                        "Cuvantul nu a fost gasit in Trie!");
            }
        }
    }
}