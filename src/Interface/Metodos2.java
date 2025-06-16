package Interface;

import Dominio.Libros;

public interface Metodos2 {
	
	public Libros Titulo (String titulo);
	public Libros Autor (String autor);
	public void  editarPrecio(float precio,String titulo, Libros libro);
	public void eliminarTitulo (String titulo);
	void editarPrecio(float precio, String titulo);
	
	

}
