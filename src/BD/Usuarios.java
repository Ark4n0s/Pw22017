package BD;
import javax.jdo.annotations.*;


@PersistenceCapable(identityType = IdentityType.APPLICATION)

public class Usuarios{

	@Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	@PrimaryKey
	private Long idusuario;

	@Persistent
	private String nombre;

	@Persistent
	private String email;

	@Persistent
	private Long idtipo;

	public Usuarios(){}

	public Usuarios(String nombre,String email,Long idtipo){
		super();
		this.nombre=nombre;
		this.email=email;
		this.email=email;
	}

	public Long getIdUsuario() {
		return this.idusuario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getEmail(){
		return this.email;
	}

	public Long getIdTipo() {
		return this.idtipo;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setIdTipo(Long idtipo) {
		this.idtipo=idtipo;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}