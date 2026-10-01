package padroesestruturais.integracaobridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TabelaPrecosTest {

    @BeforeEach
    void setUp() {
        TabelaPrecos.getInstance().restaurarValoresPadrao();
    }

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(TabelaPrecos.getInstance(), TabelaPrecos.getInstance());
    }

    @Test
    void deveRetornarPrecoBaseCadastrado() {
        assertEquals(100000.0f, TabelaPrecos.getInstance().getPrecoBase("Sedan"), 0.1f);
    }

    @Test
    void deveAplicarNovoPrecoBaseNosVeiculosCriadosPelaFactory() {
        TabelaPrecos.getInstance().setPrecoBase("Sedan", 120000.0f);
        Veiculo veiculo = VeiculoFactory.obterVeiculo("Sedan");
        assertEquals(120000.0f, veiculo.getPrecoBase(), 0.1f);
    }

    @Test
    void deveRetornarExcecaoParaPrecoNaoCadastrado() {
        try {
            TabelaPrecos.getInstance().getPrecoBase("Onibus");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço não cadastrado", e.getMessage());
        }
    }
}
