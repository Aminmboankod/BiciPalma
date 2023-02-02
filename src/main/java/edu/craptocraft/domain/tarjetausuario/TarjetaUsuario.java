package edu.craptocraft.domain.tarjetausuario;

public class TarjetaUsuario implements Autenticacion{

    private boolean activada;
    private String id;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    private String getId() {
        return this.id;
    }


    @Override
    public boolean isActivada(){
        return activada;
    }

    @Override
    public String toString(){
        return "Tarjeta de usuario" + getId();
    }

}
