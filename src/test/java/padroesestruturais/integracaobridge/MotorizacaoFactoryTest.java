package padroesestruturais.integracaobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorizacaoFactoryTest {

    @Test
    void deveRetornarMotorizacaoDiesel() {
        Motorizacao motorizacao = MotorizacaoFactory.obterMotorizacao("Diesel");
        assertEquals(0.15f, motorizacao.percentualAcrescimo(), 0.001f);
    }

    @Test
    void deveRetornarExcecaoParaMotorizacaoInexistente() {
        try {
            Motorizacao motorizacao = MotorizacaoFactory.obterMotorizacao("Vapor");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Motorização inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMotorizacaoInvalida() {
        try {
            Motorizacao motorizacao = MotorizacaoFactory.obterMotorizacao("Factory");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Motorização inválida", e.getMessage());
        }
    }
}
