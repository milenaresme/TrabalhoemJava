package entidades;

public class Personagem {
	private String nome;
	private int vida;
	private int defesa;
	private int forca;
	private int velocidade;
	
	public Personagem (String nome, int vida, int defesa, int forca, int velocidade) {
		this.nome = nome;
		this.vida = vida;
		this.defesa = defesa; 
		this.forca = forca;
		this.velocidade = velocidade;
	}
	
	
	//Getters//
	public String getNome() {
		return this.nome;
	}
	public int getVida() {
		return this.vida;
	}
	public int getDefesa() {
		return this.defesa;
	}
	public int getForca() {
		return this.forca;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
	
	
	//Getters//
}
