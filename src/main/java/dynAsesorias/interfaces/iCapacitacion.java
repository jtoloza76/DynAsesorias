package dynAsesorias.interfaces;

import java.util.List;

import dynAsesorias.modelo.Capacitacion;

public interface iCapacitacion {

	public List<Capacitacion> readAll();
	public void create(Capacitacion capa);
	
}
