package edu.craptocraft.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.domain.bicicleta.Bicicleta;

public class EstacionTest {
    


    @Test
    public void estadoEstacionTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals("id: 1, direccion: Manacor, anclajes: 6", estacion.toString());

        /*a falta de implementar test al método consultarEstacion */
    }

    @Test
    public void anclajesLibresTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(6, estacion.anclajesLibres());

        Estacion estacion2 = new Estacion(1, "Manacor", 10);
        assertEquals(10, estacion2.anclajesLibres());
    }

    @Test
    public void anclarBicicletaTest() {
        Estacion estacion = new Estacion(2, "Palma", 7);
        int[] bicicletas = { 291, 292, 293, 294, 295, 296, 297 };
        
        Bicicleta bicicleta = null;
        for (int id : bicicletas) {
            bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
        }

        System.getLogger("anclajes libres tras generar " + bicicletas.length 
                            + " bicis: " + estacion.anclajesLibres());
        assertEquals(0, estacion.anclajesLibres());
    }

}
