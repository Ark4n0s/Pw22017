package Modelos;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import BD.Tipos;
import BD.PMF;

public class TiposUtil {
	public static void insertarTipo(String nombreTipo){
		final PersistenceManager pm = PMF.get().getPersistenceManager();
	
			final Tipos t = new Tipos(nombreTipo);
			
     		try{pm.makePersistent(t);
     		
    		}finally{pm.close();}

	}

	@SuppressWarnings("unchecked")
	public static List<Tipos> todosLosTipos(){
	
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Query query = pm.newQuery(Tipos.class);
	
		try{
			return (List<Tipos>) query.execute();
			
		}catch(Exception e){
			return null;
		}finally{
			 query.closeAll();
		}
		
	}

	public static Tipos BuscarPorIdTipos(Long idtipo) {
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Tipos tipos =  pm.getObjectById(Tipos.class,idtipo);
		return tipos;


	}

	public static void BorrarTipo(Long idtipo) {
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Tipos tipos=  pm.getObjectById(Tipos.class,idtipo);
        pm.deletePersistent(tipos);


	}

}