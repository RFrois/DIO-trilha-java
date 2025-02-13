package com.br.dio.primeiros_passos.TesteBean;

import lombok.Data;

@Data
public class ViaCepResponse {

    private String cep;
    private String logradouro;
    private String localidade;

}
