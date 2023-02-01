package edu.craptocraft.domain.estacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.domain.bicicleta.Bicicleta;

public class EstacionTest {
    


    @Test
    public void EstadoEstacionTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals("id: 1, direccion: Manacor, anclajes: 6", estacion.toString());

        /*a falta de implementar test al método consultarEstacion */
    }

    @Test
    public void anclajesLibres() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(6, estacion.anclajesLibres());
    }

    @Test
    public void anclarBicicletaTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        int[] bicicletas = { 291, 292, 293, 294, 295, 296, 297 };
        
        Bicicleta bicicleta = null;
        for (int id : bicicletas) {
            bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
        }

        System.out.println("anclajes libres tras generar " + bicicletas.length 
                            + " bicis: " + estacion.anclajesLibres());
    }

}
