package edu.craptocraft.domain.estacion;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.craptocraft.domain.bicicleta.Bicicleta;

public class AnclajeTest {

    
    @Test
    public void anclarBiciTest() {
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(new Bicicleta(911));
        assertTrue(anclaje.isOcupado());
    }
}
