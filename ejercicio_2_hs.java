import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_2_hs {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double bono;
		int puntos;
		double salario_minimo;
		 
		System.out.println("Ingrese el valor de puntos:");
		puntos = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el valor de salario minimo:");
		salario_minimo = Double.parseDouble(bufEntrada.readLine());
		bono = 0;
		if (puntos>19 && puntos<=100) {
			bono = (10*salario_minimo)/100;
		}
		if (puntos>100 && puntos<=200) {
			bono = (50*salario_minimo)/100;
		}
		if (puntos>200) {
			bono = salario_minimo;
		}
		System.out.println("Valor de bono: "+bono);
	}


}

