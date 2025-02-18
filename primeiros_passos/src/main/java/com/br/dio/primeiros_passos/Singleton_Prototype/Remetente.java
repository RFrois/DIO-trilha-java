package com.br.dio.primeiros_passos.Singleton_Prototype;

import lombok.Data;

@Data
public class Remetente {

    private String nome;
    private String email;

    // Não tem os Gets e Sets por estar usando lombok para gerar
}
