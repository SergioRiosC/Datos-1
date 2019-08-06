//Ejecutable de Excep
public class EjExcep {
	public static void main(String[] args) {
		int num;
		//Try catch para evaluar excepciones
		try {
			num=5;
			//Evaluacion de errores con num=5
			if(num>=0 &&num<=10) {
				 throw new Excep(1);
			}else if(num>10 && num<=20) {
				throw new Excep(2);
			}
		}catch(Excep ex){
			System.out.println(ex.getMessage());	
		}		
	}
}
