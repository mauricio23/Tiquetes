package modelo.datos;

import java.util.ArrayList;
import modelo.mundo.Linea;
import modelo.mundo.Marca;


/**
 * Clase encargada del manejo de las marcas en la base de datos
 * @author MiPc
 *
 */
public class MarcaDAO {

	
	/**
	 * Atributo para la administración de la base de datos
	 */
	private FachadaDB fachadaDB;
	
	
	/**
	 * Metodo constructor de la calse MarcaDAO
	 * <b>post:</b> Se ha inicializada el atributo de la clase fachada, se ha creado una nueva instancia de la clase 
	 */
	public MarcaDAO(){
		fachadaDB= new FachadaDB();
	}
	
	
	/**
	 * Metodo que permite seleccionar las marcas almacenadas en la base de datos<br>
	 * <b>pre:</b> Ha inicializado el atributo fachadaDB
	 * <b>post:</b> Se ha seleccionado y retornado las marcas almacenadas en la base de datos
	 * @return La lista con las marcas seleccionadas
	 */
	public ArrayList<Linea> seleccionar(){
		
	}
	
	
	/**
	 * Metodo que actualizar una marca almacenada en la base de datos<br>
	 * <b>pre:</b> El atributo fachadaDB ha sido inicializado<br>
	 * <b>post:</b> Se ha modificado la marca ingresada como parametro
	 * @param nMarca La marca actualizar en la base de datos nMarca!=null
         * @param vNombre el viejo nombre de la marca
	 */
	public void actualizar(Marca nMarca, String vNombre){
		
	}
	
	
	/**
	 * Metodo que permite agregar una marca a la base de datos<br>
	 * <b>pre:</b> El atributo fachadaDB ha sido inicializado<br>
	 * <b>post:</b> Agregado una marca a la base de datos 
	 * @param nMarca La marca a agregar a la base de datos
	 */
	public void agregar(Marca nMarca){
		
	}
	
	
	/**
	 * Metodo que permite eliminar una marca de la base de datos<br>
	 * <b>pre:</b> El atributo fachadaDB ha sido inicializado<br>
	 * <b>post:</b> Se ha eliminado la marca pasada como parametro de la base de datos
	 * @param nMarca La marca a eliminar de la base de datos nMarca !=null
	 */
	public void eliminar(Marca nMarca){
		
	}
}