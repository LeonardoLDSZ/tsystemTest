import java.util.Scanner;


public class challenge01 {

    class Main {

        public static String ArrayChallenge(String[] strArr) {
            // code goes here
            String toCompare = strArr[0];
            String dictionary = strArr[1];
            String[] splitWords = dictionary.split(",");
            String answer = "";

            int sizeTest = 0;

            for (int i = 0, u = 0; i < splitWords.length; i++) {
                if (splitWords[i].length() > 1) {
                    if (toCompare.contains(splitWords[i])) {
                        u++;
                        sizeTest = u;
                    }
                }
            }

            String[] rep = new String[sizeTest];

            for (int i = 0, u = 0; i < splitWords.length; i++) {
                if (splitWords[i].length() > 1) {
                    if (toCompare.contains(splitWords[i])) {
                        rep[u] = splitWords[i];

                        u++;
                    }
                }
            }

            String togetherWords = "";
            String finalWord = "";
            boolean worked = false;
            for (int i = 0; i < rep.length; i++) {
                for (int u = 0; u < rep.length; u++) {
                    togetherWords = rep[i] + rep[u];

                    if (togetherWords.equals(toCompare)) {
                        finalWord = rep[i] + "," + rep[u];
                        worked = true;
                    }
                }
            }

            String token = "q2lb7tdhfe";
            String[] splitToken = token.split("");
            String[] splitFinalWord = finalWord.split("");
            String[] finalWordTwo = new String[splitToken.length + splitFinalWord.length];
            String result = "";

            for (int i = 0; i < finalWordTwo.length; i++) {
                if (i < splitFinalWord.length) {
                    result = result + splitFinalWord[i];
                }
                if (i < splitToken.length) {
                    result = result + splitToken[i];
                }
            }

            if (worked == false) {
                result = "Not Possible";
            }


            return result;
        }

        public static void main(String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(ArrayChallenge(String[]{s.nextLine()}));
        }
    }
}
