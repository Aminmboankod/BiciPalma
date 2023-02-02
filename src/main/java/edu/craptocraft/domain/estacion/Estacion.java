package edu.craptocraft.domain.estacion;


import java.util.Random;

import edu.craptocraft.domain.bicicleta.Bicicleta;
import edu.craptocraft.domain.bicicleta.Movil;
import edu.craptocraft.domain.tarjetausuario.Autenticacion;
import edu.craptocraft.domain.tarjetausuario.TarjetaUsuario;


public class Estacion {
    final int id;
    final String direccion;
    final int numAnclajes;
    final Movil[] anclajes;

    public Estacion(int id, String direccion, int numAnclajes)  {
        this.id = id;
        this.direccion = direccion;
        this.numAnclajes = numAnclajes;
        this.anclajes = new Movil[numAnclajes];
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

    public Movil[] getAnclajes() {
        return this.anclajes;
    }

    @Override
    public String toString(){
        return String.format("id: %d, direccion: %s, anclajes: %s", getId(), getDireccion(), getNumAnclajes());
    }

    public Movil[] consultarAnclajes(){
        return getAnclajes();
    }

    public void consultarEstacion(){
        System.out.println(this);
    }


    
     //Devuelve el número de anclajes que están libres
    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (Movil anclaje : getAnclajes()) {
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

    public boolean leerTarjetaUsuario(Autenticacion tarjeta) {
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjetaUsuario) {
        if (this.leerTarjetaUsuario(tarjetaUsuario) == true) {}
            Random anclajeAleatorio = new Random();
            if (tarjetaUsuario != null) {
                for (int i = 0; i < anclajes.length; i++){
                    if(anclajeAleatorio.nextBoolean()){
                        anclajes[i] = null;
                        break;
                    }
                }
                
            } else {

                System.out.println("Tarjeta de usuario inactiva");

        }
        
	}
        
}
