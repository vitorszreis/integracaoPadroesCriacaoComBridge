package padroesestruturais.integracaobridge;

public class VeiculoSedan extends Veiculo {

    public float calcularPreco() {
        return this.precoBase * (1 + this.motorizacao.percentualAcrescimo());
    }
}
