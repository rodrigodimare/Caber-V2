package Caber;

import org.junit.Test;
import static org.junit.Assert.*;


 public class LanzamientoTest {
    @Test
     public void contabilizarPuntaje_Entre_11_y_1(){
        Lanzamiento lanzamiento = new Lanzamiento(1.49,5.00);
        assertEquals(1.49,lanzamiento.contabilizarPuntaje(),0.001);
    }
    @Test
     public void contabilizar_Puntaje_Entre_9_11_y_1_2(){
        Lanzamiento lanzamiento = new Lanzamiento(2.00,-35.00);
        assertEquals(1.60,lanzamiento.contabilizarPuntaje(),0.001);
    }
    @Test
     public void tiroDescalificado(){
        Lanzamiento lanzamiento = new Lanzamiento(2.00,95.00);
        assertEquals(0,lanzamiento.contabilizarPuntaje(),0.001);
    }
}

