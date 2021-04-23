package ec.edu.ups.cotrolador;

import ec.edu.ups.entidad.Empleado;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;

@Named
@ViewScoped
public class SesionControlador implements Serializable {

    private Empleado empleado;

    public void verificarSesion(){
        try {
            FacesContext context= FacesContext.getCurrentInstance();
             empleado= (Empleado) context.getExternalContext().getSessionMap().get("Empleado");
            if(empleado!=null){
                if (empleado.getRol().getNombre().equals("ADMINISTRADOR")){
                    context.getExternalContext().redirect("/DistribuidoraJSF-1.0-SNAPSHOT/Views/private/administrador/dashboard.xhtml");
                }else {
                    context.getExternalContext().redirect("/DistribuidoraJSF-1.0-SNAPSHOT/Views/private/vendedor/dashboard.xhtml");
                }
            }
        }catch (Exception exception){

        }
    }

    public void cerrarSesion() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesContext.getCurrentInstance().getExternalContext().redirect("/DistribuidoraJSF-1.0-SNAPSHOT/index.xhtml");
        empleado=new Empleado();
    }

    public void validarRolAdministrador(){
        try {
            FacesContext context= FacesContext.getCurrentInstance();
            empleado= (Empleado) context.getExternalContext().getSessionMap().get("Empleado");
            if(empleado==null){
                context.getExternalContext().redirect("/DistribuidoraJSF-1.0-SNAPSHOT/index.xhtml");
            }else {
                if (empleado.getRol().getNombre().equals("VENDEDOR")){
                    context.getExternalContext().redirect("/DistribuidoraJSF-1.0-SNAPSHOT/index.xhtml");
                }
            }

        }catch (Exception exception){

        }
    }

    public void validarRolVendedor(){
        try {
            FacesContext context= FacesContext.getCurrentInstance();
            empleado= (Empleado) context.getExternalContext().getSessionMap().get("Empleado");
            if(empleado==null){
                context.getExternalContext().redirect("/DistribuidoraJSF-1.0-SNAPSHOT/index.xhtml");
            }else {
                if (empleado.getRol().getNombre().equals("ADMINISTRADOR")){
                    context.getExternalContext().redirect("/DistribuidoraJSF-1.0-SNAPSHOT/index.xhtml");
                }
            }

        }catch (Exception exception){

        }
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
