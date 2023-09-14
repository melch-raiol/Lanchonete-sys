package lanchonete;

import lanchonete.areaCliente.Cliente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações disponíveis para toda aplicação
        cozinheiro.avisarLanchePronto();

        Atendente atendente = new Atendente();
        // ação não disponível para toda app
        atendente.servindoMesa();
        atendente.recebendoPagamento();

        Cliente cliente = new Cliente();
        // ação não disponível para toda app
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
