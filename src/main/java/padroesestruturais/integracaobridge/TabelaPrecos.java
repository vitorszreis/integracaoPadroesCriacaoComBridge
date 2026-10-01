package padroesestruturais.integracaobridge;

import java.util.HashMap;
import java.util.Map;

public class TabelaPrecos {

    private TabelaPrecos() {
        this.restaurarValoresPadrao();
    };
    private static TabelaPrecos instance = new TabelaPrecos();
    public static TabelaPrecos getInstance() {
        return instance;
    }

    private Map<String, Float> precosBase = new HashMap<>();

    public float getPrecoBase(String veiculo) {
        if (!this.precosBase.containsKey(veiculo)) {
            throw new IllegalArgumentException("Preço não cadastrado");
        }
        return this.precosBase.get(veiculo);
    }

    public void setPrecoBase(String veiculo, float preco) {
        this.precosBase.put(veiculo, preco);
    }

    public void restaurarValoresPadrao() {
        this.precosBase.clear();
        this.precosBase.put("Sedan", 100000.0f);
        this.precosBase.put("Picape", 150000.0f);
        this.precosBase.put("Caminhao", 400000.0f);
    }
}
