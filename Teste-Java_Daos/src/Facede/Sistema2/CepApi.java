package Facede.Sistema2;

public class CepApi {

    private static CepApi instace = new CepApi();

    private CepApi(){

    }

    public static CepApi getInstance(){
        return instace;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "São Paulo";
    }
}
