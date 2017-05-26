package Modelos;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import BD.Usuarios;
import BD.PMF;



public class UsuariosUtil {
	public static void insertarUsuario(String nombreUsuario,String email,Long idtipo){
		final PersistenceManager pm = PMF.get().getPersistenceManager();
	
			
			
			
			final Usuarios u = new Usuarios(nombreUsuario,email,idtipo);
		   
		
     		try{pm.makePersistent(u);
     		 PermisosUtil.insertarPermiso(u.getIdUsuario());
    		}finally{pm.close();}

	}

	@SuppressWarnings("unchecked")
	public static List<Usuarios> todosLosUsuarios(){
	
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Query query = pm.newQuery(Usuarios.class);
	
		try{
			return (List<Usuarios>) query.execute();
			
		}catch(Exception e){
			return null;
		}finally{
			 query.closeAll();
		}
		
	}

	public static Usuarios BuscarPorIdUsuarios(Long idtipo) {
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Usuarios usuarios =  pm.getObjectById(Usuarios.class,idtipo);
		return usuarios;


	}
	
	public static void BorrarUsuario(Long idusuario) {
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Usuarios usuarios=  pm.getObjectById(Usuarios.class,idusuario);
        pm.deletePersistent(usuarios);

	}



}