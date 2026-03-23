package entidades;

public class Item {
	private int id_item;
	private String nome;
	private double tamanho;
	private int dano;
	
	//Construtor para criar novo item//
	public Item (String nome, double tamanho, int dano) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.dano = dano;
		
	}
	
	//Construtor para carregar do banco//
	public Item (int id_item,String nome, double tamanho, int dano) {
		this.id_item = id_item;
		this.nome = nome;
		this.tamanho = tamanho;
		this.dano = dano;
		
	}
	
	//Getters//
	
	public int getIdItem() {
		return this.id_item;
	}
	public String getNome() {
		return this.nome;
	}
	public double getTamanho() {
		return this.tamanho;
	}
	public int getDano() {
		return this.dano;
	}
	
	//Getters//
	
	
}