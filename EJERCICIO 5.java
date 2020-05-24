public class ejercicio_5_hs {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int anos;
		int años;
		double salario;
		int x;
		 
		System.out.println("escribe tu salario");
		salario = Double.parseDouble(bufEntrada.readLine());
		System.out.println("a que año deseas realizar el calculo");
		anos = Integer.parseInt(bufEntrada.readLine());
		x = 1;
		while (x<=anos) {
			
			salario = salario+(salario*.10);
			System.out.println("el salario en el año "+x+" es de:"+salario);
			x = x+1;
		}
		
	}


}

