import java.util.Scanner;

public class Subcadena2_cadenas_10
{

	public static void main(String[] args)
	{
		String cadena, cadenaInvertida="";
		int posicion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una frase: ");
		cadena = teclado.nextLine();
		System.out.println("Dame un valor n�merico porfa:");
		posicion = teclado.nextInt();
		teclado.close();
		
		
		for (int i=cadena.length()-1;i>=0;i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}
		System.out.println(cadenaInvertida.substring(0,posicion));
	}

}


//Realizar un programa que obtenga la parte derecha de una
//cadena de caracteres indicando la cadena y un valor num�rico entero que nos
//dir� cu�ntos caracteres debemos obtener desde el final de la cadena
