package padroesestruturais.integracaobridge;

public class VeiculoFactory {

    public static Veiculo obterVeiculo(String veiculo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroesestruturais.integracaobridge.Veiculo" + veiculo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Veículo inexistente");
        }
        if (!(objeto instanceof Veiculo)) {
            throw new IllegalArgumentException("Veículo inválido");
        }
        Veiculo v = (Veiculo) objeto;
        v.setPrecoBase(TabelaPrecos.getInstance().getPrecoBase(veiculo));
        return v;
    }
}
