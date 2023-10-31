import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuackTest {

    private  Isound Isound;

    private ByteArrayOutputStream out;

    @Before
    //
    public void before() throws Exception {
        Isound = new quack();

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @Test
    public void sound() {
        Isound.sound();
        assertTrue(out.toString().toLowerCase().contains("Isound") );
    }
    @Test
    public void testToString() {
        String esperado ="Isound{}";
        String obtenido  = Isound.toString().toLowerCase();
        assertEquals(obtenido,esperado);
    }
}