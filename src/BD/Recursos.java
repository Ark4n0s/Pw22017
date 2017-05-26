package BD;
import javax.jdo.annotations.*;


@PersistenceCapable(identityType = IdentityType.APPLICATION)

public class Recursos{
	
	@Persistent(valueStrategy=IdGeneratorStrategy.SEQUENCE)
	@PrimaryKey
	private Long idrecurso;
	@Persistent
	private String recurso;

	
	public Recursos(){
	}

	public Recursos(String recurso){
		super();
		this.recurso=recurso;
			
	}
	

	public Long getIdRecurso() {
		return idrecurso;
	}

	public String getRecurso() {
		return recurso;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}