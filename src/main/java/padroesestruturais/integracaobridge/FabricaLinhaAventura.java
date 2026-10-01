package padroesestruturais.integracaobridge;

public class FabricaLinhaAventura implements FabricaLinha {

    @Override
    public Veiculo createVeiculo() {
        return VeiculoFactory.obterVeiculo("Picape");
    }

    @Override
    public Motorizacao createMotorizacao() {
        return MotorizacaoFactory.obterMotorizacao("Hibrido");
    }
}
