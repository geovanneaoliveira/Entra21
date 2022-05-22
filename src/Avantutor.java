import java.util.Locale;
import java.util.Scanner;
public class Avantutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual exercício:");
        int ex = sc.nextInt();
        switch (ex) {
            case 1:
                System.out.println("Escreva uma frase para saber o número de espaços:");
                String frase = sc.nextLine();
                int cont = 0;
                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) == ' ')
                        cont++;
                }
                System.out.printf("A frase tem %d espaços.", cont);
                break;
            case 2:
                System.out.println("Altura:");
                int altura = sc.nextInt();
                System.out.println("Largura:");
                int largura = sc.nextInt();
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < largura; j++) {
                        System.out.print("#");
                        if (j == largura - 1) {
                            System.out.print("\n");
                        }
                    }
                }
                break;
            case 3:
                int soma = 0;
                int[] inteiros = new int[5];
                for (int i = 0; i < 5; i++) {
                    System.out.println("Digite um inteiro:");
                    inteiros[i] = sc.nextInt();
                    inteiros[i] = Math.abs(inteiros[i]);
                }
                for (int i = 0; i < 5; i++)
                    soma += inteiros[i];
                System.out.println("A soma dos 5 inteiros é: " + soma);
                break;
            case 4:
                int res = 0;
                System.out.println("Escreva um número para calcular fatorial:");
                int num = sc.nextInt();
                for (int i = num - 1; i > 0; i--) {
                    res = num * i;
                    num = res;
                }
                System.out.println("O fatorial é: " + res);
                break;
            case 5:
                String[] users = {"Hassan", "Idris", "Trevor"};
                String[] pass = {"senha1", "senha2", "senha3"};
                System.out.print("Informe o nome de usuário: ");
                String user = sc.next();
                System.out.print("Informe a senha: ");
                String senha = sc.next();
                int contagem=0;
                for (int i = 0; i < users.length; i++) {
                    if (user.equalsIgnoreCase(users[i]) && senha.equals(pass[i]))
                        System.out.println("Olá, " + users[i]);
                    else
                        contagem++;
                }
                if(contagem == users.length)
                    System.out.println("Login incorreto!");
                break;
            case 6:
                int contagem2=0;
                String password = "12345";
                for (int i = 0; i < 3; i++) {
                    System.out.println("Digite o PIN:");
                    String tentaiva = sc.next();
                    if (tentaiva.equals(password))
                        System.out.println("Senha correta, seja bem-vindo(a)!");
                    else {
                        System.out.println("Senha incorreta!");
                        contagem2++;
                    }
                }
                if(contagem2==3)
                    System.out.println("Você foi bloqueado!");
                break;
        }
    }
}
