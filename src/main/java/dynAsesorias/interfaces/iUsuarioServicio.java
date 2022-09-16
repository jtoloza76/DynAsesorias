package dynAsesorias.interfaces;

import java.util.List;

import dynAsesorias.modelo.Usuario;

public interface iUsuarioServicio {

	public List<Usuario> read();
	public Usuario read(int idusuarios);
	public void update(Usuario user);
	
}
