package edu.craptocraft.domain.estacion;
import edu.craptocraft.domain.bicicleta.Bicicleta;
import edu.craptocraft.domain.bicicleta.Movil;

public class Anclaje {

    private boolean ocupado;
    private Movil bici;

    public Anclaje() {
        this.ocupado = false;
        this.bici = null;
        
    }

    private Movil  getBici() {
        return this.bici;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public void setOcupado(boolean ocupado) {
    }

    public void anclarBici(Bicicleta bicicleta) {
    }
 


}
