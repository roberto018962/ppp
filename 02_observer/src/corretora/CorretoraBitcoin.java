package corretora;

import java.util.ArrayList;
import java.util.List;
import observadores.*;

public class CorretoraBitcoin {

    private List<Observer> clientes = new ArrayList<>();
    private double cotacaoAtual;;

    public void registrarCliente(Observer cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Observer cliente) {
        clientes.remove(cliente);
    }

    public void ajustaCotacao(double novaCotacao) {
        this.cotacaoAtual = novaCotacao;
        notificarTodos();
    }

    private void notificarTodos() {
        for (Observer cliente : clientes) {
            cliente.atualizar(cotacaoAtual);
        }
    }



}
