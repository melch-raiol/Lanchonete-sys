package lanchonete;

public class Atendente {
    private void pegandoPedidoBalcao() {
        System.out.println("pegando pedido");
    }

    public void servindoMesa() {
        System.out.println("Servindo mesas");

        pegandoPedidoBalcao();
    }

    public void recebendoPagamento() {
        System.out.println("recebendo pagamento");
    }

}
