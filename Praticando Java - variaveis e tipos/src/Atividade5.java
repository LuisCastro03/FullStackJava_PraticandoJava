//Atividade 5 - Cadastro de livros

public class Atividade5 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        System.out.println();

        String titulo = "Estrelinha do Saber";
        String autor = "Selene Chronos Grimm";
        int paginas = 24;
        double preco = 9.99;
        char categoria = 'F';
        
        String categoriaCompleta;

        if (categoria == 'F') {
            categoriaCompleta = "Ficção";
        } else if (categoria == 'N') {
            categoriaCompleta = "Não-ficção";
        } else if (categoria == 'T') {
            categoriaCompleta = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaCompleta = "História";
        } else {
            categoriaCompleta = "Categoria inválida";
        }

        System.out.println("Livro cadastrado: " + titulo + ", de " + autor +
                ". Ele possui " + paginas + " páginas, custa R$" + preco +
                " e pertence à categoria " + categoriaCompleta + ".");
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//
//        String titulo = "O Pequeno Príncipe";
//        String autor = "Antoine de Saint-Exupéry";
//        int paginas = 96;
//        double preco = 39.90;
//        char categoria = 'F';
//
//        String categoriaDescricao;
//
//        if (categoria == 'F') {
//            categoriaDescricao = "Ficção";
//        } else if (categoria == 'N') {
//            categoriaDescricao = "Não-ficção";
//        } else if (categoria == 'T') {
//            categoriaDescricao = "Tecnologia";
//        } else if (categoria == 'H') {
//            categoriaDescricao = "História";
//        } else {
//            categoriaDescricao = "Categoria inválida";
//        }
//
//        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");
//    }
//}