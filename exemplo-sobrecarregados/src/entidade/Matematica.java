package entidade;

public class Matematica {

	/*
	 * Métodos sobrecarregados, tem o mesmo nome, mas com assinaturas
	 * diferentes;
	 */

	public double getMedia(double n, double n2) {

		return (n + n2) / 2;
	}

	public double getMedia(String n, String n2) {
		
		double sn = Double.parseDouble(n);
		double sn2 = Double.parseDouble(n2);

		return (sn + sn2) / 2;
	}

}
