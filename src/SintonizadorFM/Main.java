package SintonizadorFM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        int opcion;
        Sintonizador sintonizadorFM= new Sintonizador();
        do {
        	System.out.println("   ***RADIO FM***   ");
        	System.out.println("1. Subir            ");
        	System.out.println("2. Bajar            ");
        	System.out.println("3. Emisora favorita ");
        	System.out.println("4. Apagar           ");
        	System.out.println("--------------------");
        	
        	System.out.println("Indica una opcion:");
        	opcion=entrada.nextInt();
	
        }while(opcion!=4);
        
        switch(opcion) {
        
        case 1:
        	sintonizadorFM.up();
        	sintonizadorFM.display();
        	
        case 2:
        	sintonizadorFM.down();
        	sintonizadorFM.display();
        	
        case 3:
        	System.out.println("Indica ula frecuencia favorita: ");
        	sintonizadorFM.setFrecuencia(entrada.nextDouble());
        	sintonizadorFM.display();
        	
        case 4:
        	System.err.println("Apagando...");
        	break;
        	
        default:
        	System.err.println("Opción seleccionada inexistente");
        	break;
        }
        
        entrada.close();
	}

}
