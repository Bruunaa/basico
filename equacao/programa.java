package equacao;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Delta delta = new Delta();
        Xnegativo d1 = new Xnegativo();
		Xpositivo d2 = new Xpositivo();
		
		
		System.out.println("Digite o valor de ax2: ");
		double valorAx = sc.nextDouble();
		System.out.println("Digite o valor de bx: ");
		double valorBx = sc.nextDouble();
		System.out.println("Digite o valor de c: ");
		double valorC = sc.nextDouble();
		
		d1.setA(valorAx);
		d1.setB(valorBx);
		d1.setC(valorC);
		d2.setA(valorAx);
		d2.setB(valorBx);
		d2.setC(valorC);
		
		System.out.println("Delta: "+valorBx+"^2 - 4 "+valorAx+"."+valorBx+" = "+d2.calcularDelta());
		System.out.println("Equacao: "+valorAx+"x^2 "+valorBx+"x "+valorC +" = 0");
		System.out.println("X1 :"+d2.xPositivo());
		System.out.println("X2 :"+d1.xNegativo());
	}
}


