package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public static void main(String[] args) {
        Almoxarife almoxarife = new Almoxarife();
        // ação disponível somente para o pacote Cozinheiro
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        adicionarLancheBalcao();
        adicionarSucoBalcao();
        lavarIgradientes();
        prepararLanche();
    }

    private static void adicionarLancheBalcao() {
        System.out.println("Aicionar lanche Hamburguer no balcão");
    }

    private static void adicionarSucoBalcao() {
        System.out.println("Aicionar Suco natural no balcão");
    }

    public void avisarLanchePronto() {
        System.out.println("Avisar lanche pronto");
    }

    // somente o pacote cozineiro precisa ter acesso
    private static void lavarIgradientes() {
        System.out.println("lavar os ingredientes");
    }

    private static void prepararLanche() {
        System.out.println("lavar os ingredientes");
    }
}
