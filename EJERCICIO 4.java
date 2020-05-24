public class ejercicio_4_hs {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int num1;
		int num2;
		int operation;
		int resultado;
		 
		System.out.println("ingrese el primer numero");
		num1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("ingrese el segundo numero");
		num2 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("ingrese el numero de la operacion: 1)suma 2)resta 3)multiplicacion 4)divicion 5)potenciacion");
		operation = Integer.parseInt(bufEntrada.readLine());
		switch (operation) {
		case 1:
			resultado = num1+num2;
			break;
		case 2:
			resultado = num1-num2;
			break;
		case 3:
			resultado = num1*num2;
			break;
		case 4:
			resultado = num1/num2;
			break;
		case 5:
			resultado = Math.pow(num1,num2);
			break;
		default:
			System.out.println("payaso te crees");
		}
		System.out.println("elresultado de la operacion es:"+resultado);
	}


}

