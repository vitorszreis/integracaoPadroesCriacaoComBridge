package padroesestruturais.integracaobridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoVeiculoTest {

    @BeforeEach
    void setUp() {
        TabelaPrecos.getInstance().restaurarValoresPadrao();
    }

    @Test
    void deveRetornarValorPedidoLinhaUrbana() {
        PedidoVeiculo pedido = new PedidoVeiculo(new FabricaLinhaUrbana());
        assertEquals(100000.0f, pedido.calcularValorPedido(), 0.1f);
    }

    @Test
    void deveRetornarValorPedidoLinhaSustentavel() {
        PedidoVeiculo pedido = new PedidoVeiculo(new FabricaLinhaSustentavel());
        assertEquals(140000.0f, pedido.calcularValorPedido(), 0.1f);
    }

    @Test
    void deveRetornarValorPedidoLinhaAventura() {
        PedidoVeiculo pedido = new PedidoVeiculo(new FabricaLinhaAventura());
        assertEquals(197500.0f, pedido.calcularValorPedido(), 0.1f);
    }

    @Test
    void deveRetornarValorPedidoLinhaCarga() {
        PedidoVeiculo pedido = new PedidoVeiculo(new FabricaLinhaCarga());
        assertEquals(460000.0f, pedido.calcularValorPedido(), 0.1f);
    }

    @Test
    void deveCriarLinhaCargaComCaminhaoDiesel() {
        PedidoVeiculo pedido = new PedidoVeiculo(new FabricaLinhaCarga());
        assertTrue(pedido.getVeiculo() instanceof VeiculoCaminhao);
        assertTrue(pedido.getVeiculo().getMotorizacao() instanceof MotorizacaoDiesel);
    }

    @Test
    void deveRefletirAlteracaoDaTabelaDePrecosNoPedido() {
        TabelaPrecos.getInstance().setPrecoBase("Caminhao", 500000.0f);
        PedidoVeiculo pedido = new PedidoVeiculo(new FabricaLinhaCarga());
        assertEquals(575000.0f, pedido.calcularValorPedido(), 0.1f);
    }
}
