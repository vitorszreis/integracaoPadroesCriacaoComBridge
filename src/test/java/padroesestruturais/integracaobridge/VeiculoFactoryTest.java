package padroesestruturais.integracaobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoFactoryTest {

    @Test
    void deveRetornarExcecaoParaVeiculoInexistente() {
        try {
            Veiculo veiculo = VeiculoFactory.obterVeiculo("Conversivel");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Veículo inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaVeiculoInvalido() {
        try {
            Veiculo veiculo = VeiculoFactory.obterVeiculo("Conceito");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Veículo inválido", e.getMessage());
        }
    }
}
