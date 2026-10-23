public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Sobrescrita de métodos ===");

        Veiculo[] veiculos = {new Carro(), new Bicicleta()};
        for (Veiculo veiculo : veiculos) {
            veiculo.mover();
        }

        System.out.println("\n=== 2. Sobrecarga de métodos ===");
        Calculadora calculadora = new Calculadora();
        System.out.println("somar(2, 3) = " + calculadora.somar(2, 3));
        System.out.println("somar(-5, 8) = " + calculadora.somar(-5, 8));
        System.out.println("somar(1, 2, 3) = " + calculadora.somar(1, 2, 3));
        System.out.println("somar(10, -4, 0) = " + calculadora.somar(10, -4, 0));
        System.out.println("somar(2.5, 3.7) = " + calculadora.somar(2.5, 3.7));
        System.out.println("somar(-1.5, 0.5) = " + calculadora.somar(-1.5, 0.5));
    }
}
