package dynAsesorias.modelo;

public class Contacto {

	private String usuario;
	private String email;
	private String mensaje;
	
	public Contacto() {
		super();
	}
		
	public Contacto(String usuario, String email, String mensaje) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.mensaje = mensaje;
	}

	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
