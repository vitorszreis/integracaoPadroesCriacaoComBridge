package padroesestruturais.integracaobridge;

public class FabricaLinhaSustentavel implements FabricaLinha {

    @Override
    public Veiculo createVeiculo() {
        return VeiculoFactory.obterVeiculo("Sedan");
    }

    @Override
    public Motorizacao createMotorizacao() {
        return MotorizacaoFactory.obterMotorizacao("Eletrico");
    }
}
