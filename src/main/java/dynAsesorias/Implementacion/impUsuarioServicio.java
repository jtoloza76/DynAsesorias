package dynAsesorias.Implementacion;

import java.util.List;

import dynAsesorias.interfaces.iUsuario;
import dynAsesorias.interfaces.iUsuarioServicio;
import dynAsesorias.modelo.Usuario;

public class impUsuarioServicio implements iUsuarioServicio {

	iUsuario usuario = new impUsuario();
	
	
	@Override
	public List <Usuario> read() {
	
		return usuario.read();
		
	}

	@Override
	public void update(Usuario user) {
		
		usuario.update(user);
		

	}

	@Override
	public Usuario read(int idusuarios) {

		return usuario.read(idusuarios);
	}

	
}
