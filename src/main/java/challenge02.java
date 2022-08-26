import java.util.Scanner;

public class challenge02 {

    class Main {

        public static String StringChallenge(String str) {

            // code goes here

            String[] splitWord = str.split("[^a-zA-Z0-9']");

            for (int i = 0; i < splitWord.length; i++) {

                if (i > 0) {
                    splitWord[i] = splitWord[i].substring(0, 1).toUpperCase() + splitWord[i].substring(1).toLowerCase();
                }
            }

            String togetherWord = "";

            for (int i = 0; i < splitWord.length; i++) {
                togetherWord = togetherWord + splitWord[i];
            }

            String token = "q2lb7tdhfe";
            String[] splitToken = token.split("");
            String[] splitTogetherWord = togetherWord.split("");
            int sizeArray = splitToken.length + splitTogetherWord.length;
            String result = "";

            for (int i = 0; i < sizeArray; i++) {
                if (i < splitTogetherWord.length) {
                    result = result + splitTogetherWord[i];
                }
                if (i < splitToken.length) {
                    result = result + splitToken[i];
                }
            }

            return result;
        }

        public static void main(String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(StringChallenge(s.nextLine()));
        }
    }
}
