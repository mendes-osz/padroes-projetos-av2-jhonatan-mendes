package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    public String nome;
    public int quantidade;
    public List<EstoqueObserver> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void adicionarObservador(EstoqueObserver observador) {
        observadores.add(observador);
    }

    public void removerObservador(EstoqueObserver observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int novaQuantidade) {
        if (this.quantidade != novaQuantidade) {
            int antiga = this.quantidade;
            this.quantidade = novaQuantidade;
            notificarObservadores(antiga, novaQuantidade);
        }
    }

    public void notificarObservadores(int quantidadeAntiga, int novaQuantidade) {
        for (EstoqueObserver obs : observadores) {
            obs.atualizar(this.nome, quantidadeAntiga, novaQuantidade);
        }
    }
}