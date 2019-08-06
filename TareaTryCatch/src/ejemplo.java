public class ejemplo {
	//Creacion de variables a utilizar
	int numerador=5;
	int denominador=0;
	float division;
	//Creacion de varios metodos para que se puedan llamar entre ellos
	private void metodo1() {
		try {
			metodo2();
		} catch (Exception e) {
			System.out.println(e.getMessage());// Imprime el error (division entre 0)
		}
	}
	private void metodo2() throws Exception {//"throws Exception" Necesario para mandar errores entre metodos
		try {
			metodo3();			
		} catch (Exception e) {
			throw e;   //Pasa el error al metodo que lo llamo
		}
	}
	private void metodo3() throws Exception {//"throws Exception" Necesario para mandar errores entre metodos
		//Metodo try, ejecuta una division
		try {
			division=numerador /denominador;			
		} //Metodo catch se ejecuta si hay un error en try 
		catch (Exception e) {
			division=0; // Valor dado a la division si se encuentra un error
			throw e;    //Pasa el error al metodo que lo llamo
		}//Metodo finally se ejecuta haya o no un error
		finally {
			System.out.println(division);// Instruccion que ejecuta el finally
		}
	}
	public static void main(String[] args) {
		ejemplo ej=new ejemplo();
		ej.metodo1();
	}
}