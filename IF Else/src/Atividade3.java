import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        System.out.println("Hello, world.");

        System.out.println();

        int senha = 123456;

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Digite a senha: ");
//        scan.nextInt();

        if (senha == 123456) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}

//import java.util.Scanner;
//
//public class ValidaSenha {
//    public static void main(String[] args) {
//        String senhaCorreta = "123456";
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite a senha: ");
//        String tentativaSenha = scanner.nextLine();
//
//        scanner.close();
//
//        if (tentativaSenha.equals(senhaCorreta)) {
//            System.out.println("Acesso permitido!");
//        } else {
//            System.out.println("Acesso negado!");
//        }
//    }
//}