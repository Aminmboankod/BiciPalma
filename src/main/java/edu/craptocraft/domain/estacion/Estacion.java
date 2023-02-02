package edu.craptocraft.domain.estacion;


import edu.craptocraft.domain.bicicleta.Bicicleta;


public class Estacion {
    final int id;
    final String direccion;
    final int numAnclajes;
    final Bicicleta[] anclajes;

    public Estacion(int id, String direccion, int numAnclajes)  {
        this.id = id;
        this.direccion = direccion;
        this.numAnclajes = numAnclajes;
        this.anclajes = new Bicicleta[numAnclajes];
    }

    private int getId(){
        return this.id;
    }

    private String getDireccion(){
        return this.direccion;
    }

    private int getNumAnclajes(){
        return this.numAnclajes;
    }

    public Bicicleta[] getAnclajes() {
        return this.anclajes;
    }

    @Override
    public String toString(){
        return String.format("id: %d, direccion: %s, anclajes: %s", getId(), getDireccion(), getNumAnclajes());
    }

    public Bicicleta[] consultarAnclajes(){
        return getAnclajes();
    }

    public void consultarEstacion(){
        System.out.println(this);
    }


    
     //Devuelve el número de anclajes que están libres
    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (Bicicleta anclaje : getAnclajes()) {
            if (anclaje == null) {
                anclajesLibres += 1;
            }
    }
    return anclajesLibres;

    }

    public void anclarBicicleta(Bicicleta bicicleta) {

        for (int i = 0; i < anclajes.length; i++) {
            if (this.anclajes[i] == null) {
                this.anclajes[i] = bicicleta;
                break;
            }
        }
    }
        
}
