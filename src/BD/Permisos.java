package BD;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.*;

import com.google.appengine.datanucleus.annotations.Unowned;


@PersistenceCapable(identityType = IdentityType.APPLICATION)

public class Permisos{
	
	@Persistent
	@PrimaryKey
	private Long idusuario;
	@Persistent
	@Unowned
	private List<Long> idrecursos=new ArrayList<Long>();
	@Persistent
	@Unowned
	private List<Boolean> permiso=new ArrayList<Boolean>();
	
	
	
	public Permisos(){
	}

	public Permisos(Long idusuario){
		super();
		this.idusuario=idusuario;
		
	}
	
	public Long getIdUsuario () {
		return this.idusuario;
	}
	
	public List<Long> getIdRecursos () {
		return this.idrecursos;
	}
	
	public void setIdRecursos(Long recurso){
		this.idrecursos.add(recurso);
		
	}
	
	public List<Boolean> getPermisos () {
		return this.permiso;
	}
	
	public void setPermisos(Boolean permiso){
		this.permiso.add(permiso);
		
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}