package br.wals;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class Banco implements IBanco {

    private String nome;
    private List<IConta> contas = new ArrayList<>();


    @Override
    public void imprimirQuantidadeDeContas() {
        System.out.println(String.format("%s - Quantidade de Contas: %d", nome, contas.size()));
    }

    @Override
    public void listarContas() {
        System.out.println(String.format("=== %s - Lista de contas ===", nome));
        contas.forEach(System.out::println);
        System.out.println("=======================");
    }

    @Override
    public void listarClientes() {
        System.out.println("Lista de clientes");
        contas.stream()
                .map(item -> item.getCliente())
                .collect(Collectors.toList())
                .stream().distinct()
                .forEach(System.out::println);
    }

    @Override
    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    @Override
    public void removerConta(IConta conta) {
        contas.remove(conta);
    }

}
