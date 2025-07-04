package org.example.designDeProjeto;

/*
*Singleton "Lazy Holder"
*
* uma classe interna que encapsula a instância do singleton
* */
public class SingletonLazyHolder {

    public static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
