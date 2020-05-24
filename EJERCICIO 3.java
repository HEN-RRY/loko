public class ejercicio_3_hs {

	public static void main(final String args[]) throws IOException {
		final BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		String sexo;
		// datos de entrada// 
		System.out.println("inserte su sexo");
		sexo = bufEntrada.readLine();
		System.out.println("inserte su edad");
		edad = Integer.parseInt(bufEntrada.readLine());
		if (edad==16) {
			System.out.println("deve aplicarse vacuna a");
		} else {
			if (edad>69) {
				System.out.println("deve aplicarse vacuna c");
			} else {
				switch (sexo) {
				case "mujer":
					if (edad>=16 && edad<=69) {
						System.out.println("debe aplicar la vacuna b");
					} else {
						System.out.println("no debe aplicarse vacuna");
					}
					break;
				case "hombre":
					if (edad>=16 && edad<=69) {
						System.out.println("deve aplicar la vacuna a");
					} else {
						System.out.println("no aplicarse vacuna");
					}
					break;
				default:
					System.out.println("opcion no valida");
				}
			}
		}
	}


}

