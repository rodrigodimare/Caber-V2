package Caber;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class PodioDistanciaTest {
    @Test
    public void obtenerGanadoresTest(){

        ArrayList<Concursante> concursantes = new ArrayList<Concursante>();

        Concursante concursante1 = new Concursante(1);
        Concursante concursante2 = new Concursante(2);
        Concursante concursante3 = new Concursante(3);

        concursante1.efectuarLanzamiento(1.49,5.00,1);
        concursante1.efectuarLanzamiento(1.50,3.00,2);
        concursante1.efectuarLanzamiento(1.51,-3.00,3);

        concursante2.efectuarLanzamiento(2.10,6.00,1);
        concursante2.efectuarLanzamiento(2.00,-6.00,2);
        concursante2.efectuarLanzamiento(1.00,2.00,3);

        concursante3.efectuarLanzamiento(2.30,-35.00,1);
        concursante3.efectuarLanzamiento(1.30,-92.00,2);
        concursante3.efectuarLanzamiento(1.00,1.00,3);

        concursantes.add(concursante1);
        concursantes.add(concursante2);
        concursantes.add(concursante3);

        ArrayList<Concursante> ganadores = new PodioDistancia().obtenerGanadores(concursantes);
        ArrayList<Concursante> assertGanadores = new ArrayList<Concursante>();
        assertGanadores.add(concursante1);
        assertGanadores.add(concursante2);
        assertGanadores.add(concursante3);

        int primeroActual = ganadores.get(0).getIdConcursante();
        int segundoActual = ganadores.get(1).getIdConcursante();
        int terceroActual = ganadores.get(2).getIdConcursante();

        assertEquals(2,primeroActual);
        assertEquals(1,segundoActual);
        assertEquals(3,terceroActual);
    }
}