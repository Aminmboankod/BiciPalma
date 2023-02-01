package edu.craptocraft.domain.bicicleta;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BicicletaTest {
    @Test
    public void constructorBicicleta() {
        Bicicleta bicicleta = new Bicicleta(100);
        assertEquals("Bicicleta: 100", bicicleta.toString());
    }
}
