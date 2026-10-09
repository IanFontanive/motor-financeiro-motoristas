public class MotoristaPremium extends Motorista {

    private static final double TAXA_PLATAFORMA = 0.15;
    private static final double BONUS_POR_CORRIDA = 2.0;

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public void registrarCorrida(double valor) {
        super.registrarCorrida(valor);
        adicionarAoValorBruto(BONUS_POR_CORRIDA);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorBrutoTotal() * (1 - TAXA_PLATAFORMA);
    }
}