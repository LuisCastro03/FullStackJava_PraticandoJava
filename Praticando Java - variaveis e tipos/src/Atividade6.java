//Atividade 6 - Classificação por categoria

public class Atividade6 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        System.out.println();

        double preco = 150.00;
        String categoriaEconomica = "Econômico";
        String categoriaIntermediaria = "Intermediário";
        String categoriaPremium = "Premium";

        String categoriaProduto;

        if (preco <= 50.00) {
            categoriaProduto = categoriaEconomica;
        } else if (preco >= 50.01 && preco <= 200.00) {
            categoriaProduto = categoriaIntermediaria;
        } else {
            categoriaProduto = categoriaPremium;
        }

        System.out.println("Categoria do produto: " + categoriaProduto);
    }
}
