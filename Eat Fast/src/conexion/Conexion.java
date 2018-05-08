package conexion;

import org.hibernate.Session;
import org.hibernate.Transaction;

import proyectoDAO.Cliente;
import utils.HibernateUtils;

public class Conexion {

	private static Session session;
	
	public static void main(String[] args) {

		//Abrir sesion con Hibernate
		session = HibernateUtils.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		//Hacer commit
		boolean commit = true;
		
		crearClinte("Viti", "87654321B", "Calle de Raquel", 987465123);

		//Hacer commit BBDD
		if (commit) {			
			transaction.commit();
		}
		//Cerrar la sesion
		session.close();
		
		System.exit(0);
	}

	public static void crearClinte(String nombre, String dni, String direccion, int telefono) {
		Cliente c = new Cliente(nombre, dni, direccion, telefono, null);
		session.save(c);
	}
}
