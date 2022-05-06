package equacao;
import java.lang.Math;

public class Xpositivo extends Delta {
    public double xPositivo(){
        return ((-super.getB()) + Math.sqrt(this.calcularDelta()))/ (2 * super.getA());
    }   
}
