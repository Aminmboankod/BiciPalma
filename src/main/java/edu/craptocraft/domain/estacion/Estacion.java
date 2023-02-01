package edu.craptocraft.domain.estacion;

import edu.craptocraft.domain.bicicleta.Bicicleta;

public class Estacion {
    final int id;
    final String direccion;
    private Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes)  {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId(){
        return this.id;
    }

    private String getDireccion(){
        return this.direccion;
    }

    private int numAnclajes() {
        return this.anclajes.numAnclajes();
    }

    @Override
    public String toString(){
        return String.format("id: %d, direccion: %s, anclajes: %s", getId(), getDireccion(), numAnclajes());
    }

    public Anclaje[] consultarAnclajes(){
        return anclajes();
    }

    public void consultarEstacion(){
        System.out.println(this);
    }

    private Anclaje[] anclajes() {
        return this.anclajes.getAnclajes();
    }

    
     //Devuelve el número de anclajes que están libres
    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (Anclaje anclaje : anclajes()) {
            if (anclaje == null) {
                anclajesLibres += 1;
            }
    }
    return anclajesLibres;

    }

    public void anclarBicicleta(Bicicleta bicicleta) {
    }

}
