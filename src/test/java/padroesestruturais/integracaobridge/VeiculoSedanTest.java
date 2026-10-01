package padroesestruturais.integracaobridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoSedanTest {

    @BeforeEach
    void setUp() {
        TabelaPrecos.getInstance().restaurarValoresPadrao();
    }

    @Test
    void deveRetornarPrecoSedanComFlex() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Sedan");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Flex"));
        assertEquals(100000.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoSedanComDiesel() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Sedan");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Diesel"));
        assertEquals(115000.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoSedanComHibrido() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Sedan");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Hibrido"));
        assertEquals(125000.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoSedanComEletrico() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Sedan");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Eletrico"));
        assertEquals(140000.0f, veiculo.calcularPreco(), 0.1f);
    }
}
