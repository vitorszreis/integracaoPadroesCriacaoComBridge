package padroesestruturais.integracaobridge;

public class PedidoVeiculo {

    private Veiculo veiculo;

    public PedidoVeiculo(FabricaLinha fabrica) {
        this.veiculo = fabrica.createVeiculo();
        this.veiculo.setMotorizacao(fabrica.createMotorizacao());
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public float calcularValorPedido() {
        return this.veiculo.calcularPreco();
    }
}
