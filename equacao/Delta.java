package equacao;

import java.lang.Math;

public class Delta extends EquValores {
	private double valorDelta;

	// #region [getter e setter]
	public void setValorDelta() {
		this.valorDelta = valorDelta;
	}

	public double getValorDelta(double valorDelta) {
		return valorDelta;
	}
	// #endregion

	//#region - Regra de Negócio
	public double calcularDelta() {
		double valor1 = Math.pow(super.getB(), 2);
		this.valorDelta = valor1 - (4 * super.getA() * super.getC());
		return this.valorDelta;
	}
	//#endregion
}