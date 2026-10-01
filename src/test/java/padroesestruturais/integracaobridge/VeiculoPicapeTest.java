package padroesestruturais.integracaobridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoPicapeTest {

    @BeforeEach
    void setUp() {
        TabelaPrecos.getInstance().restaurarValoresPadrao();
    }

    @Test
    void deveRetornarPrecoPicapeComFlex() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Picape");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Flex"));
        assertEquals(158000.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoPicapeComDiesel() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Picape");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Diesel"));
        assertEquals(181700.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoPicapeComHibrido() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Picape");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Hibrido"));
        assertEquals(197500.0f, veiculo.calcularPreco(), 0.1f);
    }

    @Test
    void deveRetornarPrecoPicapeComEletrico() {
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Picape");
        veiculo.setMotorizacao(MotorizacaoFactory.obterMotorizacao("Eletrico"));
        assertEquals(221200.0f, veiculo.calcularPreco(), 0.1f);
    }
}
