public class ejercicio_1_hs {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cuantas_notas;
		int i;
		double nota;
		double nota_anterior;
		int porcentaje;
		double promedio;
		
		System.out.println("escriba cuantas notas:");
		cuantas_notas = Integer.parseInt(bufEntrada.readLine());
		nota_anterior = 0;
		for (i=1;i<=cuantas_notas;i++) {
			System.out.println("escriba la nota :"+i);
			nota = Double.parseDouble(bufEntrada.readLine());
			System.out.println("escriba el porcentaje:"+i);
			porcentaje = Integer.parseInt(bufEntrada.readLine());
			nota_anterior = nota_anterior+(porcentaje*nota);
		}
		promedio = nota_anterior/100;
		System.out.println("el promedio es:"+promedio);
	}


}

