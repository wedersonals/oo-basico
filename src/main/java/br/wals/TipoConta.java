package br.wals;

public enum TipoConta {

    POUPANCA("Poupança"),
    CONTA_CORRENTE("Conta Corrente");

    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    private final String tipoConta;
}
