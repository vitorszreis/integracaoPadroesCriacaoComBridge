package padroesestruturais.integracaobridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoCaminhaoTest {

    @BeforeEach
    void setUp() {
        TabelaPrecos.getInstance().restaurarValoresPadrao();
    }

    @Test
    void deveRetornarPrecoCaminhaoComFlex() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Caminhao");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Flex"));
        assertEquals(400000.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoCaminhaoComDiesel() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Caminhao");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Diesel"));
        assertEquals(460000.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoCaminhaoComEletrico() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Caminhao");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Eletrico"));
        assertEquals(560000.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoCaminhaoTresEixosComDiesel() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Caminhao");
        ((VeiculoCaminhao) veiculo).setNumEixos(3);
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Diesel"));
        assertEquals(506000.0f, veiculo.calcularPreco(), 0.1f);
    }
}
