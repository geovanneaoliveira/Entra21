import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            boolean valida = false;
            String frase = "";
            System.out.print("Digite 1 para encriptar e 2 para desencriptar: ");
            int valor = in.nextInt();
            if (valor != 1 && valor != 2) {
                while (!valida) {
                    System.out.print("Valor inválido! Digite novamente: ");
                    valor = in.nextInt();
                    if (valor == 1 || valor == 2) {
                        valida = true;
                    }
                }
            }
            if (valor == 1) {
                in.nextLine();
                System.out.print("Digite uma frase para encriptá-la!: ");
                frase = in.nextLine();
                System.out.println(Encriptar(frase.toLowerCase()));
            } else {
                in.nextLine();
                System.out.print("Digite algo em código morse para ser desencriptado: ");
                frase = in.nextLine();
                String desencriptado = Desencriptar(frase);
                for (int i = 0; i < desencriptado.length(); i++) {
                    if (desencriptado.charAt(i) != '|') {
                        System.out.print(desencriptado.charAt(i));
                    }
                }
                System.out.println();
            }
            System.out.print("DESEJA TENTAR NOVAMENTE? (Y/N): ");
            String retry = in.nextLine();
            if (!retry.equalsIgnoreCase("Y") && !retry.equalsIgnoreCase("N")) {
                while (true) {
                    System.out.print("Alternativa inválida, digite novamente: ");
                    retry = in.nextLine();
                    if (retry.equalsIgnoreCase("y") || retry.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
            if (retry.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static String Encriptar(String frase) {
        int par = 0;
        char[] palavrab = new char[frase.length() * 2];
        for (int i = 0; i < frase.length() * 2; i++) {
            if (i % 2 == 0) {
                palavrab[i] = frase.charAt(par);
                par++;
            } else {
                palavrab[i] = '|';
            }
        }
        frase = String.valueOf(palavrab);
        String encriptada = frase.replace("1", ".----").replace("2", "..---").replace("3", "...--")
                .replace("4", "....-").replace("5", ".....").replace("6", "-....")
                .replace("7", "--...").replace("8", "---..").replace("9", "----.")
                .replace("0", "-----").replace("b", "-...").replace("c", "-.-.")
                .replace("f", "..-.").replace("h", "....").replace("j", ".---")
                .replace("l", ".-..").replace("p", ".--.").replace("q", "--.-")
                .replace("v", "...-").replace("x", "-..-").replace("y", "-.--")
                .replace("z", "--..").replace("d", "-..").replace("g", "--.")
                .replace("k", "-.-").replace("o", "---").replace("r", ".-.")
                .replace("s", "...").replace("u", "..-").replace("w", ".--")
                .replace("a", ".-").replace("i", "..").replace("m", "--")
                .replace("n", "-.").replace("e", ".").replace("t", "-")
                .replace(" ", "*");
        return encriptada;
    }
    public static String Desencriptar(String frase) {
        String decifrado = frase.replace("-.-.--", "!").replace("--..--", ",")
                .replace(".----", "1").replace("..---", "2").replace("...--", "3")
                .replace("....-", "4").replace(".....", "5").replace("-....", "6")
                .replace("--...", "7").replace("---..", "8").replace("----.", "9")
                .replace("-----", "0").replace("-...", "b").replace("-.-.", "c")
                .replace("..-.", "f").replace("....", "h").replace(".---", "j")
                .replace(".-..", "l").replace(".--.", "p").replace("--.-", "q")
                .replace("...-", "v").replace("-..-", "x").replace("-.--", "y")
                .replace("--..", "z").replace("-..", "d").replace("--.", "g")
                .replace("-.-", "k").replace("---", "o").replace(".-.", "r")
                .replace("...", "s").replace("..-", "u").replace(".--", "w")
                .replace(".-", "a").replace("..", "i").replace("--", "m")
                .replace("-.", "n").replace(".", "e").replace("-", "t")
                .replace("*", " ");
        return decifrado;
    }
}
