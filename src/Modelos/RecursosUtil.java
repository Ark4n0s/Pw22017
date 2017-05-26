package Modelos;
import java.util.List;


import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import BD.Recursos;
import BD.PMF;

public class RecursosUtil {
	public static void insertarRecurso(String nombreRecurso){
		final PersistenceManager pm = PMF.get().getPersistenceManager();
	
			final Recursos r = new Recursos(nombreRecurso);
			
     		try{pm.makePersistent(r);
     		
    		}finally{pm.close();}

	}

	@SuppressWarnings("unchecked")
	public static List<Recursos> todosLosRecursos(){
	
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Query query = pm.newQuery(Recursos.class);
	
		try{
			return (List<Recursos>) query.execute();
			
		}catch(Exception e){
			return null;
		}finally{
			 query.closeAll();
		}
		
	}

	public static Recursos BuscarPorIdRecurso(Long idrecursos) {
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Recursos recursos =  pm.getObjectById(Recursos.class,idrecursos);
		return recursos;


	}

	public static void BorrarRecurso(Long idrecursos) {
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Recursos recursos =  pm.getObjectById(Recursos.class,idrecursos);
        pm.deletePersistent(recursos);


	}

}