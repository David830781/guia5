package com.senati.eti.model;

public class Publicacion {
	private String titulos;
	private String autor;
	private int tipo;
	public String getTitulos() {
		return titulos;
	}
	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	// Constructores
		public Publicacion() {
		
		}
		public Publicacion(String titulos, String autor, int tipo) {
			
			this.titulos = titulos;
			this.autor = autor;
			this.tipo = tipo;
		}
		
		public String NombreTitulo() {
			return this.titulos ;
		}
		
		public String MostrarAutor() {
			
			return this.autor;
		}
		
		public String MostrarTipo() {
			return (this.tipo != 1 ? "Revista" : "Libro"  ) ;
		}
		
	}
