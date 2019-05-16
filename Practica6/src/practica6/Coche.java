package practica6;

public class Coche {
	public static final String EL_COCHE_CON_MATRICULA = "El coche con matricula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1() {
		String resultado = "";
		if (combustible == "Gasolina") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else if (combustible == "Híbrido") {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += metodoA(modelo, fabricante);
		} else {
			resultado += EL_COCHE_CON_MATRICULA + matricula + " ";
			resultado += "no dispone de información";
		}
		return resultado;
	}

	private String metodoA(String modelo, String fabricante) {
		return "Modelo: " + modelo + "Fabricante: " + fabricante;
	}
}
