import java.util.Scanner;

public class Edabit {
    public static void main(String[] args) {
        System.out.println(forbiddenLetter(new String[]{"abc", "def", "ghi"},'a'));
    }

    public static boolean forbiddenLetter(String[] palavras, char letraProibida) {
        boolean achou = false;
        for (String palavrinha: palavras) {
            for (int i = 0; i < palavrinha.length(); i++) {
                achou = palavrinha.charAt(i) == letraProibida;
                if (achou)
                    break;
            }
            if (achou)
                break;
        }
        return achou;
    }
}
