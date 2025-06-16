package Dominio;

public class Libros {
	
	private String titulo;
	private int anioPublicacion;
	private String autor;
	private int numPag;
	private float precio;
	
	public Libros(String titulo, int anioPublicacion, String autor, int numPag, float precio) {
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.autor = autor;
		this.numPag = numPag;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "libros [titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + ", numPag="
				+ numPag + ", precio=" + precio + "]\n";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
