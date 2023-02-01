package edu.craptocraft.domain.estacion;

public class Anclajes {
    

    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
    }
    
    Anclaje[] getAnclajes() {
		    return this.anclajes;
    }
    
    int numAnclajes() {
        return this.anclajes.length;
    }

    @Override
    public String toString() {
        return "Numero de anclajes: "+ numAnclajes();
    }

    
}
