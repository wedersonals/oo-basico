package br.wals;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cliente implements ICliente {

    private String nome;

}
