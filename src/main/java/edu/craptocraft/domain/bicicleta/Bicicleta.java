package edu.craptocraft.domain.bicicleta;

public class Bicicleta {
    private final Integer id;

    public Bicicleta(int id) {
        this.id = id;
    }

    private int  getId(){
        return this.id;
    }


    @Override
    public String  toString(){
        return "Bicicleta: " + getId();
    }
}
