package dynAsesorias.modelo;

public class Capacitacion {

	private String nombreCurso;
    private String nombreDocente;
    private String fechaInicio;
    private String fechaTermino;
    private String precio;
            
	public Capacitacion() {
		super();
	}

	public Capacitacion(String nombreCurso, String nombreDocente, String fechaInicio, String fechaTermino,
			String precio) {
		super();
		this.nombreCurso = nombreCurso;
		this.nombreDocente = nombreDocente;
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.precio = precio;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNombreDocente() {
		return nombreDocente;
	}

	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
    
    
}
