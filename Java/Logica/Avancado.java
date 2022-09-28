import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        Character c = 'c';
//        Integer i = 10;
//        i = null;
//        ArrayList arr = new ArrayList();
        ex3();
    }
    public static void ex1(){
//       PEDIR PRO USUARIO INFORMAR N NUMEROS INTEIRO ATE DIGITAR 0
//       QUANDO ELE DIGITAR 0 MOSTRAR A LISTA DOS NUMEROS DIGITADOS
        ArrayList inteiros = new ArrayList();
        while (true){
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if(escolha==0){
                break;
            }
        }
        System.out.print("Valores informados: ");
        for(int i = 0; i<inteiros.size();i++){
            if(i > 0 && i<inteiros.size()-1){
                System.out.print(", ");
            }
            System.out.print(inteiros.get(i));
        }
    }
    public static void ex2(){
//        PEDIR PRO USUARIO INFORMAR VALORES INTEIROS ATE QUE SEJA INFORMADO 0
//        QUANDO FOR INFORMADO 0, MOSTRAR OS VALORES QUE O USUARIO DIGITOU
//        MOSTRAR A SOMA DOS NUMEROS PARES E DOS NUMEROS IMPARES
//        MOSTRAR A MÉDIA DE TODOS OS VALORES INFORMADOS
        ArrayList<Integer> numeros = new ArrayList<>();
        while (true){
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            numeros.add(escolha);
            if(escolha==0){
                break;
            }
        }
        int somaPares = 0;
        int somaImpares = 0;
        for (Integer i: numeros) {
            if(i % 2 == 0){
                somaPares += i;
            } else {
                somaImpares += i;
            }
        }
        double somaTotal = somaImpares+somaPares;
        double media = somaTotal/numeros.size()-1;
        System.out.print("Soma dos pares: ");
        System.out.println(somaPares);
        System.out.print("Soma dos ímpares: ");
        System.out.println(somaImpares);
        System.out.print("Média: ");
        System.out.println(media);
    }
    public static void ex3(){
        ArrayList<String> palavras = new ArrayList<>();
        while(true){
            System.out.print("Informe uma palavra: ");
            String palavra = in.nextLine();
            if (palavra.equalsIgnoreCase("SAIR")){
                break;
            }
            palavras.add(palavra);
        }
        System.out.print("Informe um número para filtrar: ");
        int filtro = in.nextInt();
        palavras.removeIf(palavra -> palavra.length() < filtro);
        System.out.println(palavras);
    }
}
