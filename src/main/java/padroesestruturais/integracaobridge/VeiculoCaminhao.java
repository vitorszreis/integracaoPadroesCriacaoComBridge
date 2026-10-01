package padroesestruturais.integracaobridge;

public class VeiculoCaminhao extends Veiculo {

    private int numEixos = 2;

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public float calcularPreco() {
        float acrescimoEixos = 0.1f * (this.numEixos - 2);
        return this.precoBase * (1 + acrescimoEixos) * (1 + this.motorizacao.percentualAcrescimo());
    }
}
