package br.wals;

public interface IBanco {

    void imprimirQuantidadeDeContas();
    void listarContas();
    void listarClientes();
    void adicionarConta(IConta conta);
    void removerConta(IConta conta);

}
