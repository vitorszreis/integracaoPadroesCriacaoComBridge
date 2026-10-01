package padroesestruturais.integracaobridge;

public class FabricaLinhaUrbana implements FabricaLinha {

    @Override
    public Veiculo createVeiculo() {
        return VeiculoFactory.obterVeiculo("Sedan");
    }

    @Override
    public Motorizacao createMotorizacao() {
        return MotorizacaoFactory.obterMotorizacao("Flex");
    }
}
