package com.example.pcstore.model;

public enum Categoria {
	
	PROCESSADOR ("Processador"),
	PLACA_MAE("Placa mãe"),
	PLACA_DE_VIDEO("Placa de video"),
	MEMORIA_RAM("Memoria ram"),
	HD("Hd"),
	SSD("Ssd");
	
	private String nomePeca ;
	
	private Categoria() {
		
	}
	
	private Categoria(String nomePeca) {
		this.nomePeca = nomePeca;
	}

	public String getNomePeca() {
		return nomePeca;
	}
	

}
