package PackageTriangulo;

import PackageTriangulo.Triangulo;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTest {

    public TrianguloTest() {
    }
    
    @Test
    public void testValidaTriangulo(){
        Triangulo test = new Triangulo();
        Set<String> expResult = new HashSet<>();
        expResult.add("Válido");
        expResult.add("Isósceles");
        Set<String> result = test.ValidaTriangulo(5, 4, 5);
        assertEquals(expResult.toString(), result.toString());
    }
}