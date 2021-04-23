package ec.edu.ups.entidad;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
	private List<Producto> productos;

	public Categoria() {

	}
	
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return String.format("Categoria[%o, %s]",codigo,nombre);
	}
}
