package br.wals;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Banco X");

        Cliente cliente = new Cliente();
        cliente.setNome("Wederson");


        IConta contaCorrente = new ContaCorrente(cliente);
        IConta poupanca = new ContaPoupanca(cliente);
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(poupanca);

        contaCorrente.depositar(100.00);
        contaCorrente.transferir(100.00, poupanca);

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.imprimirQuantidadeDeContas();
        banco.listarContas();
        banco.listarClientes();

        banco.removerConta(contaCorrente);
        banco.imprimirQuantidadeDeContas();

    }
}
