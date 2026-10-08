
public class Pedido {
    private EstadoPedido estado = EstadoPedidoNovo.getInstance();

    public void cancelar() {
        estado = estado.cancelar();
    }

    public void preparar() {
        estado = estado.preparar();
    }

    public void entregar() {
        estado = estado.entregar();
    }

    public void sairParaEntrega() {
        estado = estado.sairParaEntrega();
    }
}
