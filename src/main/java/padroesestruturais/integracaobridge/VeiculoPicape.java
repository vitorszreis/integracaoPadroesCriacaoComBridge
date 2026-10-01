package padroesestruturais.integracaobridge;

public class VeiculoPicape extends Veiculo {

    private float valorKitOffRoad = 8000.0f;

    public float calcularPreco() {
        return (this.precoBase + this.valorKitOffRoad) * (1 + this.motorizacao.percentualAcrescimo());
    }
}
