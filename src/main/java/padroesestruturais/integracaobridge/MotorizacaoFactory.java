package padroesestruturais.integracaobridge;

public class MotorizacaoFactory {

    public static Motorizacao obterMotorizacao(String motorizacao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroesestruturais.integracaobridge.Motorizacao" + motorizacao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Motorização inexistente");
        }
        if (!(objeto instanceof Motorizacao)) {
            throw new IllegalArgumentException("Motorização inválida");
        }
        return (Motorizacao) objeto;
    }
}
