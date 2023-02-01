package edu.craptocraft.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnclajesTest {
    

    @Test
    public void constructorAnclajes(){
        Anclajes anclajes = new Anclajes(6);
        assertEquals("Numero de anclajes: 6", anclajes.toString());
    }

}
