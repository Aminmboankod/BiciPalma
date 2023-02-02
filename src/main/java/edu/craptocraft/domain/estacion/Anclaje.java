package edu.craptocraft.domain.estacion;
import edu.craptocraft.domain.bicicleta.Bicicleta;
import edu.craptocraft.domain.bicicleta.Movil;

public class Anclaje {

    private boolean ocupado = false;
    private Movil bici = null;

    private Movil  getBici() {
        return this.bici;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void anclarBici(Movil bici) {
        this.bici = bici;
        this.ocupado = true;
    }
 


}
