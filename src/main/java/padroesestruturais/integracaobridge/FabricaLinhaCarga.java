package padroesestruturais.integracaobridge;

public class FabricaLinhaCarga implements FabricaLinha {

    @Override
    public Veiculo createVeiculo() {
        return VeiculoFactory.obterVeiculo("Caminhao");
    }

    @Override
    public Motorizacao createMotorizacao() {
        return MotorizacaoFactory.obterMotorizacao("Diesel");
    }
}
