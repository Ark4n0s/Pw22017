package BD;
import javax.jdo.annotations.*;


@PersistenceCapable(identityType = IdentityType.APPLICATION)

public class Tipos{
	
	@Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	@PrimaryKey
	private Long idtipo;
	@Persistent
	private String tipo;

	
	
	
	public Tipos(){
	}

	public Tipos(String tipo){
		super();
	    this.tipo=tipo;
		
	}
	

	public Long getIdTipo() {
		return idtipo;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}