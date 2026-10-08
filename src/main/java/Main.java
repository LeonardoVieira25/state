public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.preparar();
        pedido.sairParaEntrega();
        pedido.entregar();
    }
}
