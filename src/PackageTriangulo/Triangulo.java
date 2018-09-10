package PackageTriangulo;



import java.util.HashSet;
import java.util.Set;

public class Triangulo {

    public Set<String> ValidaTriangulo(double a, double b, double c){    
        Set<String> propriedades = new HashSet<String>();

        double hipotenusa = DefineHipotenusa(a, b, c);

        if ((a + b + c - hipotenusa) > hipotenusa) {
            propriedades.add("Válido");

            VerificaTipoTriangulo(a, b, c, hipotenusa, propriedades);

            VerificaEscaleno(a, b, c, hipotenusa, propriedades);
            
            VerificaRetangulo(a, b, c, hipotenusa, propriedades);

        } else {
            propriedades.add("Inválido");
        }
        
        return propriedades;
    }
    
    public double DefineHipotenusa(double a, double b, double c){
        double hipotenusa = a;

        if (hipotenusa < b) {
            hipotenusa = b;
        } else if (hipotenusa < c) {
            hipotenusa = c;
        }
        return hipotenusa;
    }
    
    public void VerificaRetangulo(double a, double b, double c, double hipotenusa, Set<String> propriedades){
        if (((a * a + b * b + c * c) - hipotenusa * hipotenusa) == hipotenusa * hipotenusa) {
            propriedades.add("Retângulo");
        }
    }
    
    public void VerificaEscaleno(double a, double b, double c, double hipotenusa, Set<String> propriedades){
        if (a != b && b != c && c != a) {
            propriedades.add("Escaleno");
        }
    }
    
    public void VerificaTipoTriangulo(double a, double b, double c, double hipotenusa, Set<String> propriedades){
        if (a == b || b == c || c == a) {
            if (a == b && b == c) {
                propriedades.add("Equilátero");
            } else {
                propriedades.add("Isósceles");
            }
        }
    }
    
}
