package Modelos;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import BD.Permisos;
import BD.PMF;

public class PermisosUtil {
	public static void insertarPermiso(Long idusuario){
		final PersistenceManager pm = PMF.get().getPersistenceManager();
	
			final Permisos p = new Permisos(idusuario);
			
     		pm.makePersistent(p);
     		
    		

	}

	@SuppressWarnings("unchecked")
	public static List<Permisos> todosLosPermisos(){
	
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Query query = pm.newQuery(Permisos.class);
	
		try{
			return (List<Permisos>) query.execute();
			
		}catch(Exception e){
			return null;
		}finally{
			 query.closeAll();
		}
		
	}

	public static Permisos BuscarPorIdPermiso(Long idusuario) {
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Permisos permisos =  pm.getObjectById(Permisos.class,idusuario);
		return permisos;


	}

	public static void ModificarPermiso(Long idusuario,Long idrecursos,Boolean permiso) {
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Permisos permisos =  pm.getObjectById(Permisos.class,idusuario);
		permisos.setIdRecursos(idrecursos);
		permisos.setPermisos(permiso);

	}

}