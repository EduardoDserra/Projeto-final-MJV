package com.example.pcstore.model;

public enum Marca {

	INTEL("Intel"), 
	AMD("Amd"), 
	ASUS("Asus");

	private String marcas;

	
	private Marca() {
		
	}
	private Marca(String marcas) {
		this.marcas = marcas;
	}

	public String getMarcas() {
		return marcas;
	}

}
