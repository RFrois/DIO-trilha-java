package org.example.designDeProjeto;

/*
* Singleton "apressado"
* */

public class SingletonEager {

     private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
