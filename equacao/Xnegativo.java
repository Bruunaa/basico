package equacao;
import java.lang.Math;


public class Xnegativo extends Delta {
    public double xNegativo(){
       return ((-super.getB()) - Math.sqrt(this.calcularDelta()))/ (2 * super.getA());
    }
}
