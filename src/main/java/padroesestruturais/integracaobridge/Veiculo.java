package padroesestruturais.integracaobridge;

public abstract class Veiculo {

    protected Motorizacao motorizacao;

    protected float precoBase;

    public Motorizacao getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(Motorizacao motorizacao) {
        this.motorizacao = motorizacao;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
