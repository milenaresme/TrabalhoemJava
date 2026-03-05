package entidades;

public class Item {
	private String nome;
	private String cor;
	private String tamanho;
	private int dano;
	
	public Item (String nome, String cor, String tamanho, int dano) {
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
		this.dano = dano;
		
	}
	
	
	//Getters//
	
	public String getNome() {
		return this.nome;
	}
	public String getCor() {
		return this.cor;
	}
	public String getTamanho() {
		return this.tamanho;
	}
	public int getDano() {
		return this.dano;
	}
	
	//Getters//
}