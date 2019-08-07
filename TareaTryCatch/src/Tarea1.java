import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Tarea1 extends JFrame{
	private String[] imp;
	public Tarea1 () throws Exception {
		//Creacion de tabla
		super("Mi tabla");
		DefaultTableModel modelo=new DefaultTableModel();
		//Declaracion de variables a utilizar 
		String[] imp;
		String[] f;
		int b = 0;
		int o=0;
		int i=0;
		//Ubicacion del archivo .csv
		File file=new File("C:\\Users\\xpc\\Desktop\\borre.csv");//Ubicacion de archivo
		try {
			Scanner inputStream=new Scanner(file);
			String p=inputStream.next();//Primera linea del archivo
			f=p.split(",");
			while(o!=f.length) {
				
				modelo.addColumn(f[o]);
				o++;
			}
			while(inputStream.hasNext()) {
				String data=inputStream.next();//Resto de lineas del archivo
				imp=data.split(",");
				System.out.println(imp);
				
				modelo.addRow(imp);
			}
			inputStream.close();			
		}		
		catch(NullPointerException ex) {
			System.out.println(ex);
		}		
		//Tmaño de tabla  y ventana   
		JTable tabla=new JTable(modelo);
		JScrollPane scroll=new JScrollPane(tabla);
		tabla.setBounds(12,22,500,500);
		setSize(750,700);
		scroll.setBounds(12,22,500,500);
		add(scroll);
		setLayout(null);
		setVisible(true);
	}			
	public static void main(String[] args) throws Exception {
		Tarea1 t1=new Tarea1();
	}	
}