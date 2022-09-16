package dynAsesorias.interfaces;

import java.util.List;

import dynAsesorias.modelo.Usuario;

public interface iUsuario {

	public List<Usuario> readAll();
	public List<Usuario> read();
	public Usuario read(int idusuarios);
	public void create(Usuario user);
	public void update(Usuario user);
	
}
