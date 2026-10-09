public class Main {

    public static void main(String[] args) {
        Motorista iniciante = new MotoristaIniciante("Carlos Silva", "ABC-1234");
        Motorista premium = new MotoristaPremium("Ana Souza", "DEF-5678");
        Motorista frotista = new MotoristaParceiroFrotista("João Pereira", "GHI-9012");

        registrarCorridasDoIniciante(iniciante);
        registrarCorridasDoPremium(premium);
        registrarCorridasDoFrotista(frotista);

        imprimirExtrato(iniciante);
        imprimirExtrato(premium);
        imprimirExtrato(frotista);
    }

    private static void registrarCorridasDoIniciante(Motorista motorista) {
        motorista.registrarCorrida(30.0);
        motorista.registrarCorrida(45.5);
        motorista.registrarCorrida(22.0);
    }

    private static void registrarCorridasDoPremium(Motorista motorista) {
        motorista.registrarCorrida(60.0);
        motorista.registrarCorrida(35.0);
        motorista.registrarCorrida(80.0);
        motorista.registrarCorrida(42.5);
    }

    private static void registrarCorridasDoFrotista(Motorista motorista) {
        for (int corrida = 1; corrida <= 20; corrida++) {
            motorista.registrarCorrida(70.0);
        }
    }

    private static void imprimirExtrato(Motorista motorista) {
        System.out.println("==========================================");
        System.out.println("          EXTRATO DO MOTORISTA");
        System.out.println("==========================================");
        System.out.println("Categoria........: " + motorista.getClass().getSimpleName());
        System.out.println("Nome.............: " + motorista.getNome());
        System.out.println("Placa............: " + motorista.getPlacaVeiculo());
        System.out.println("Qtd. de corridas.: " + motorista.getQuantidadeCorridas());
        System.out.printf("Valor bruto......: R$ %.2f%n", motorista.getValorBrutoTotal());
        System.out.printf("Valor líquido....: R$ %.2f%n", motorista.calcularPagamentoLiquido());
        System.out.println("==========================================");
        System.out.println();
    }
}