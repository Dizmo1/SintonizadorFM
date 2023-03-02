package SintonizadorFM;

public class Sintonizador {

     private double frecuencia;	
     public Sintonizador(double frecuencia) { // debo validar que sea una frecencia válida
    	 if(frecuencia<80) {
    		 this.frecuencia=80;
    	 }else if (frecuencia>180) {
    		 this.frecuencia=108;
    	 }else {
    		 this.frecuencia=frecuencia;
    	 }
     }
     
     public Sintonizador() { //constructor sin atributos se inicializa en 80
    	 //this(80);//no tiene sentido
    	 this.frecuencia=80;
     }
     
     
     public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
		comprobarFrecuencia();
	}

	public double down() {
    	 this.frecuencia-=0.5; //bajamos la frecuencia en 0.5Mhz
    	 //debo comprobar que la frecuencia este entre 0 y 108 MHZ
    	 comprobarFrecuencia();
    	 return this.frecuencia;
     }
     public double up() {
    	 this.frecuencia+=0.5; //bajamos la frecuencia en 0.5Mhz
    	 //debo comprobar que la frecuencia este entre 0 y 108 MHZ
    	 comprobarFrecuencia();
    	 return this.frecuencia;
    	 
     }
     
     public void display() {
    	 System.out.println("Sintonizando: " + this.frecuencia+ " MHz");
     }
     
     private void comprobarFrecuencia() { //solo puedo acceder al método desde la misma clase
    	 if(this.frecuencia<80) {
    		 this.frecuencia=108;
    	 }else if(this.frecuencia>108) {
    		 this.frecuencia=80;
    	 }
     }
}
