package org.example;

import java.util.logging.Logger;

public class ConexaoBanco {

    public static final Logger LOGGER = Logger.getLogger(ConexaoBanco.class.getName());

    public void iniciarConexao(){
        //conexão inicializada
        LOGGER.info("Iniciou Conexão");
    }

    public void finalizarConexao(){
        //conexão finalizada
        LOGGER.info("finalizou Conexão");
    }

    public void inserirDados(Pessoa pessoa){
        //inserir dados no DB
        LOGGER.info("Inseriu dados" + " " + pessoa.getNome());
    }

    public void removeuDados(Pessoa pessoa){
        //removeu dados no DB
        LOGGER.info("Removeu dados" + " " + pessoa.getNome());
    }
}