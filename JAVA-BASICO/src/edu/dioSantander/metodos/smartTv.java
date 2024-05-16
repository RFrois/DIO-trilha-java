package edu.dioSantander.metodos;

public class smartTv {

   
        boolean ligado = false;
        int volume = 25;
        int canal = 1;


        public void aumentarVolume() {
                volume ++;
                System.out.println("Aumentando o volume para: " + volume);
        }
        public void diminuirVolume(){
                volume --;
                System.out.println("Diminuindo o volume para: " + volume);
        }
        public void ligarTv() {
                ligado = true;
        }
        public void desligarTv(){
                ligado = false;
        }
        public void aumentarCanal() {
                canal ++;
        }
        public void diminuirCanal(){
                canal --;
        }
        public void canalNumeral(int numeroCanal) {
                canal = numeroCanal;
        }
        public void statusTv() {
                System.out.println("Volume: " + volume);
                System.out.println("Canal: " + volume);
                System.out.println("TV Ligada: " + volume);
        }


    

}
