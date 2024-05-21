package edu.dioSantander.metodos;

public class metodos {

    public static void main(String[] args) {
        
        smartTv smartTv = new smartTv();

        System.out.println("TV ligada? " + smartTv.ligado);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.aumentarVolume();

        System.out.println("Status atual de TV: " + smartTv.ligado);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.canalNumeral(10);
        
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.statusTv();
        
    }

}
