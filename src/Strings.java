import java.util.Locale;
import java.util.Scanner;

public class Strings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        ex9();
    }

    public static void ex1() {
        System.out.print("Informe uma String: ");
        String pri = sc.nextLine();
        System.out.print("Informe outra: ");
        String seg = sc.nextLine();
        System.out.println("Iguais: " + pri.equals(seg));
        System.out.println("Iguais ignorando CASE: " + pri.equalsIgnoreCase(seg));
    }

    public static void ex2() {
        System.out.print("Informe uma string: ");
        String pri = sc.nextLine();
        System.out.print("Informe outra string: ");
        String seg = sc.nextLine();
        if (pri.contains(seg))
            System.out.println("Contém.");
        else if (seg.contains(pri))
            System.out.println("Contém.");
        else
            System.out.println("Não contém.");
    }

    public static void ex3() {
        System.out.print("Informe uma string: ");
        String pri = sc.nextLine();
        System.out.print("Informe outra string: ");
        String seg = sc.nextLine();
        if (pri.startsWith(seg))
            System.out.println("A primeira começa com a segunda.");
        else if (seg.startsWith(pri))
            System.out.println("A segunda começa com a primeira.");
        else
            System.out.println("Não são prefixos.");
    }

    public static void ex4() {
        System.out.print("Informe uma string: ");
        String pri = sc.nextLine();
        System.out.print("Informe outra string: ");
        String seg = sc.nextLine();
        if (pri.endsWith(seg))
            System.out.println("A segunda é sufixo da primeira.");
        else if (seg.endsWith(pri))
            System.out.println("A primeira é sufixo da segunda.");
        else
            System.out.println("Não são sufixos.");
    }

    public static void ex5() {
        System.out.print("Informe uma string: ");
        String pri = sc.nextLine();
        System.out.print("Informe outra string: ");
        String seg = sc.nextLine();
        int pos = pri.indexOf(seg);
        System.out.println("A posição da segunda na primeira é: " + pos);
    }

    public static void ex6() {
        String encriptada = "lala#lwve#-rwgra22lalang!#<3";
        System.out.println(encriptada.replace("w", "o").replace("#", " ")
                .replace("2", "m").replace("lala", "i").replace("-", "p"));
    }

    public static void ex7() {
        System.out.print("Quantos inteiros deseja informar?: ");
        int quantos = sc.nextInt();
        int[] numeros = new int[quantos];
        for (int i = 0; i < quantos; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = sc.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for (int valor : numeros) {
            if (valor % 2 == 0)
                somaPar += valor;
            else
                somaImpar += valor;
        }
        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);
    }

    public static void ex8() {
        System.out.println("Quantas palavras deseja informar?: ");
        int numpalavras = sc.nextInt();
        String[] palavras = new String[numpalavras];
        for (int i = 0; i < numpalavras; i++){
            System.out.print("Informe uma palavra: ");
            palavras[i]=sc.next();
        }
        System.out.print("Informe um número maior que 0: ");
        int numero = sc.nextInt();
        for(int i =0; i<numpalavras;i++){
            if(palavras[i].length()<numero)
                palavras[i]=null;
        }
        for(String palavra: palavras) {
            if(palavra!=null){
                System.out.print(palavra + " ");
            }
        }
    }
    public static void ex9(){
        int cont=0;
        System.out.print("Qual o tamanho da primeira lista?: ");
        int tam1 = sc.nextInt();
        int[] lista1 = new int[tam1];
        String[] lista3 = new String[tam1];
        for(int i =0;i<tam1;i++){
            System.out.print("Escreva o inteiro: ");
            lista1[i]=sc.nextInt();
        }
        System.out.print("Qual o tamanho da segunda lista?: ");
        int tam2 = sc.nextInt();
        int[] lista2 = new int[tam2];
        for(int i =0;i<tam2;i++){
            System.out.print("Escreva o inteiro: ");
            lista2[i]=sc.nextInt();
        }
        for(int i=0;i<tam1;i++){
            for(int j=0;j<tam2;j++){
                if(lista1[i]!=lista2[j]){
                    cont++;
                }
                if(cont==tam2){
                    lista3[i]=String.valueOf(lista1[i]);
                } else {
                    lista3[i]=null;
                }
            }
            cont=0;
        }
        for(String valor:lista3){
            if(valor!=null){
                System.out.println(valor);
            }
        }
    }
}
