//Atividade 10 - Planejando uma viagem: consumo e autonomia

public class Atividade10 {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        System.out.println();

        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = (consumoMedio * capacidadeTanque);
        double autonomiaAtual = (consumoMedio * combustivelAtual);

        System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
        System.out.println("Autonomia atual: " + autonomiaAtual + " km");
        System.out.println("Quantidade de combustível gasto: " + distanciaViagem / consumoMedio);
        System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");

    }
}
