package edu.craptocraft.domain.estacion;

public class Estacion {
    final int id;
    final String direccion;
    private int anclajes;

    public Estacion(int id, String direccion, int anclajes)  {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = anclajes;
    }

    @Override
    public String toString(){
        return "id: "+this.id + ", direccion: "+ this.direccion + ", anclajes: "+ this.anclajes;
    }


    public void consultarEstacion(){
        System.out.println(this);
    }
}
