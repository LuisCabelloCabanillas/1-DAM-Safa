import com.safa.lcc.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.safa.lcc.Main.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ejercicio1 {
    Main main;
    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    public void test() {
        String resultado=muestraOpcionesOrdenadas();

        assertEquals("",resultado,"El resultado es incorrecto");
    }

    @AfterEach
    void tearDown() {
        main = null;
    }
}
