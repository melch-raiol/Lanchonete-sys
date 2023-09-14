package lanchonete.areaCliente;

public class Cliente {
    public static void main(String[] args) {

    }

    public void escolherLanche() {
        System.out.println("escolher lanche");
    }

    public void fazerPedido() {
        System.out.println("fazer pedido");
    }

    public void pagarConta() {
        System.out.println("pagarConta");

        consultatSaldo();
    }

    private void consultatSaldo() {
        System.out.println("consultar saldo bancário");
    }
}
