public class Excep extends Exception {
	private int error;
	public Excep(int error ) {
		super();//constructor de clase padre
		this.error=error;
	}
	public String getMessage() {
		String mensaje="";
		switch(error) {//Manejo de la excepcion
		case 1:
			mensaje="Error 1";//mensaje de error
			break;
		case 2:
			mensaje="Error 2";//mensaje de error
			break;			
		}return mensaje;
	}
}
