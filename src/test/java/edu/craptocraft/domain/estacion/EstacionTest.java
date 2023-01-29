package edu.craptocraft.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EstacionTest {
    


    @Test
    public void testEstacionData() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals("id: 1, direccion: Manacor, anclajes: 6", estacion.toString());
    }
}
