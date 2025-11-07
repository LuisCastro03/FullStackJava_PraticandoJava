//Atividade 9 - Verificação de idade e escopo de variáveis

public class Atividade9 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        System.out.println();

        int idade = 17;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        System.out.println();
    }
}

//public class Main {
//    public static void main(String[] args) {
//        int idade = 17; // Declara a variável antes da verificação
//        String mensagem; // Declara a variável antes do bloco condicional
//
//        if (idade >= 18) {
//            mensagem = "Você é maior de idade.";
//        } else {
//            mensagem = "Você é menor de idade.";
//        }
//
//        System.out.println(mensagem); // Agora a variável está acessível
//    }
//}