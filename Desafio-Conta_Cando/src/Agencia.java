public class Agencia {

    
   boolean agenciaRetorno;
  

   public boolean Agencia(String agenciaDigitada){
   
    if ("0001".equals(agenciaDigitada)) {
        agenciaRetorno = true;
        
    }else{
        agenciaRetorno = false;
    }
    return agenciaRetorno;
}


    
}
