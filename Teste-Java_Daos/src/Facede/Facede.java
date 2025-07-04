package Facede;

import Facede.Sistema1.ServiceCRM;
import Facede.Sistema2.CepApi;

public class Facede {

    public void migrarCliente(String nome,String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        ServiceCRM.gravarCliente(nome,cep,estado,cidade);

        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}   
