package com.avatar.pokemon.model;

import java.util.List;

public class Pokemon {
	
	private int id;
	private String nombre;
	private String tipoPrincipal;
	private String tipoSecundario;
	private double altura;
	private double peso;
	private List<String> listaAtaques;
	private List<String> cadenaEvolutiva;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoPrincipal() {
		return tipoPrincipal;
	}
	public void setTipoPrincipal(String tipoPrincipal) {
		this.tipoPrincipal = tipoPrincipal;
	}
	public String getTipoSecundario() {
		return tipoSecundario;
	}
	public void setTipoSecundario(String tipoSecundario) {
		this.tipoSecundario = tipoSecundario;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public List<String> getListaAtaques() {
		return listaAtaques;
	}
	public void setListaAtaques(List<String> listaAtaques) {
		this.listaAtaques = listaAtaques;
	}
	public List<String> getCadenaEvolutiva() {
		return cadenaEvolutiva;
	}
	public void setCadenaEvolutiva(List<String> cadenaEvolutiva) {
		this.cadenaEvolutiva = cadenaEvolutiva;
	}

}
