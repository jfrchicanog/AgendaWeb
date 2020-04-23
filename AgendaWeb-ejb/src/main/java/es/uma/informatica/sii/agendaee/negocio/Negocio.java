
package es.uma.informatica.sii.agendaee.negocio;

import javax.ejb.Local;
import javax.ws.rs.core.UriBuilder;

import es.uma.informatica.sii.agendaee.entidades.Contacto;
import es.uma.informatica.sii.agendaee.entidades.Usuario;

/**
 *
 * @author francis
 */
@Local
public interface Negocio {
    public void registrarUsuario(Usuario u, UriBuilder uriBuilder);
    public void validarCuenta(String cuenta, String validacion);
    public void compruebaLogin(Usuario u);
    public Usuario refrescarUsuario(Usuario u);
    public void modificar(Contacto c);
    public void insertar(Contacto c);
    public void eliminarContacto(Contacto c);
}

