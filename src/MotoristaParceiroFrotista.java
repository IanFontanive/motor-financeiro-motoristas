public class MotoristaParceiroFrotista extends Motorista {

    private static final double TAXA_PLATAFORMA = 0.20;
    private static final double ALUGUEL_VEICULO = 800.0;

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamento = getValorBrutoTotal() * (1 - TAXA_PLATAFORMA) - ALUGUEL_VEICULO;

        if (pagamento < 0) {
            return 0.0;
        }

        return pagamento;
    }
}