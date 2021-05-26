package Caber;

import org.junit.Test;

import static org.junit.Assert.*;

    public class ConcursanteTest {

    @Test
    public void obtenerDiferenciaTotalTest() {

        Concursante concursante = new Concursante(1);

        concursante.efectuarLanzamiento(2.00, 5.00, 1);
        concursante.efectuarLanzamiento(1.00, 3.00, 2);
        concursante.efectuarLanzamiento(1.00, 3.00, 3);

        double diferenciaTotal = concursante.diferenciaTotal();
        assertEquals(4,diferenciaTotal,0.1);
    }

        @Test
        public void lanzamientoDescalificado() {

            Concursante concursante = new Concursante(1);

            concursante.efectuarLanzamiento(2.00, 5.00, 1);
            concursante.efectuarLanzamiento(1.00, 3.00, 2);
            concursante.efectuarLanzamiento(1.00, -93.00, 3);

            boolean descalificado = concursante.algunLanzamientoDescalificado();
            assertEquals(true,descalificado);
        }

        @Test
        public void lanzamientosValidos() {

            Concursante concursante = new Concursante(1);

            concursante.efectuarLanzamiento(2.00, 5.00, 1);
            concursante.efectuarLanzamiento(1.00, 3.00, 2);
            concursante.efectuarLanzamiento(1.00, -3.00, 3);

            boolean noDescalificado = concursante.algunLanzamientoDescalificado();
            assertEquals(false,noDescalificado);
        }

        @Test
        public void puntajeTotal() {

            Concursante concursante = new Concursante(1);

            concursante.efectuarLanzamiento(2.50, 5.00, 1);
            concursante.efectuarLanzamiento(1.50, 3.00, 2);
            concursante.efectuarLanzamiento(1.50, -3.00, 3);

            double total = concursante.puntajeTotal();
            assertEquals(5.5,total,0.1);
        }

}