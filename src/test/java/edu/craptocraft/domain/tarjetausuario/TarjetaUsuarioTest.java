package edu.craptocraft.domain.tarjetausuario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.domain.bicicleta.Bicicleta;
import edu.craptocraft.domain.estacion.Estacion;

public class TarjetaUsuarioTest {
    
    @Test
    public void retirarBicicletaTest() {

        Estacion estacion = new Estacion(1, "Manacor", 6);
		System.out.println("\n **** caso TEST retirar bicicleta **** \n");
 
		TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);
		System.out.println("¿tarjeta de usuario activada? (true/false): " 
            + estacion.leerTarjetaUsuario(tarjetaUsuario));
		assertEquals(true, estacion.leerTarjetaUsuario(tarjetaUsuario));

		
        int[] bicicletas = { 291, 292, 293, 294, 295, 296, 297 };
        
        Bicicleta bicicleta = null;
        for (int id : bicicletas) {
            bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
        }
 
		estacion.retirarBicicleta(tarjetaUsuario);
		
		estacion.consultarAnclajes();
		assertEquals(1, estacion.anclajesLibres());
		System.out.println("anclajes libres: " + estacion.anclajesLibres());

    }
    @Test
    public void desactivarTarjetaTest() {

        System.out.println("\n **** caso TEST tarjeta inactiva **** \n");

        Estacion estacion = new Estacion(1, "Manacor", 6);
        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);

        tarjetaUsuario.setActivada(false);

        System.out.println("¿tarjeta de usuario activada? (true/false): "
                + estacion.leerTarjetaUsuario(tarjetaUsuario));
        assertEquals(false, estacion.leerTarjetaUsuario(tarjetaUsuario));
        estacion.retirarBicicleta(tarjetaUsuario);

        estacion.consultarAnclajes();
    }
}
