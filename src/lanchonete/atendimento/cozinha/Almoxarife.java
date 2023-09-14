package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("controlando a entrada dos ítens");
    }

    private void controlarSaida() {
        System.out.println("controlando a saída dos ítens");
    }

    // ações somente para o pacote Cozinha
    void entregarIngredientes() {
        System.out.println("Entregando ingredientes para cozinheiro");

        controlarEntrada();
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("trocar o gás");
    }
}
