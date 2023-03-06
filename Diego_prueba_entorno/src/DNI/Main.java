package DNI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		
		Scanner sc = new Scanner(System.in);
		int dni=2;
		
		do {
		System.out.print("Introduce el número de tu DNI: ");
		dni = sc.nextInt();

		if(dni<0||dni>99999999) 			
			System.out.println("<<<DNI INCORRECTO>>>");
		
		}while(dni<0||dni>99999999);
		
		
		char letraCorrecta = Entidades.CompruebaLetra(dni);
		char letra;
		
		
		do {
		System.out.print("Introduce la letra de tu DNI: ");
		letra = sc.next().charAt(0); 
		
		
		char mayuscula=Character.toUpperCase(letra);
		letra=mayuscula;
		
		if(letraCorrecta!=letra)
			System.out.println("<<<LETRA INCORRECTA>>>");
		
		}while(letraCorrecta!=letra);
		
		
		System.out.println("El número y la letra son correctos");
		System.out.println("Su DNI es el siguiente: "+dni+"-"+letraCorrecta);

		
		sc.close();
		

	}
	

}
