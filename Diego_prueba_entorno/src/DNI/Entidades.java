package DNI;

public class Entidades 
{

	
	public static char CompruebaLetra(int numDni) 
	{
		
			char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 
					'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
			
			
			int numeroLetra = numDni%23;
			
			char letraDni = letras[numeroLetra];
			
			
			return letraDni;
		
	}
	
		
}


