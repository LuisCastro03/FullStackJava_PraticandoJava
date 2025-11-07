public class Atividade2 {
    public static void main(String[] args) {
        System.out.println("Hello, world.");

        System.out.println();

        double mediaNota = 10.0;

        if (mediaNota >= 7.0) {
            System.out.println("O estudante teve média " + mediaNota + " e foi aprovado.");
        } else if (mediaNota >= 5.0 && mediaNota <= 6.9) {
            System.out.println("O estudante teve médoa " + mediaNota + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + mediaNota + " e foi reprovado.");
        }
    }
}

//public class Aprovacao {
//    public static void main(String[] args) {
//        double media = 4.3;
//
//        if (media >= 7.0) {
//            System.out.println("O aluno teve média " + media + " e foi aprovado.");
//        } else if (media >= 5.0) {
//            System.out.println("O aluno teve média " + media + " e está de recuperação.");
//        } else {
//            System.out.println("O aluno teve média " + media + " e foi reprovado.");
//        }
//    }
//}