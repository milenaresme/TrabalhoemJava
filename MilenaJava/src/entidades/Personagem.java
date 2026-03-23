package entidades;
import java.util.List;

public class Personagem {
	private int id_personagem;
	private String nome;
	private int vida;
	private int defesa;
	private int forca;
	private int velocidade;
	private int alcance;
	
	private List<Item> itens;
	private Jogador jogador;
	
	//Construtor para criar novo personagem//
	public Personagem (String nome, int vida, int defesa, int forca, int velocidade, int alcance, List<Item> itens, Jogador jogador) {
		this.nome = nome;
		this.vida = vida;
		this.defesa = defesa; 
		this.forca = forca;
		this.velocidade = velocidade;
		this.alcance = alcance;
		this.itens = itens;
		this.jogador = jogador;
	}
	
	//Construtor para carregar do banco//
	public Personagem (int id_personagem,String nome, int vida, int defesa, int forca, int velocidade, int alcance, List<Item> itens, Jogador jogador) {
		this.id_personagem = id_personagem;
		this.nome = nome;
		this.vida = vida;
		this.defesa = defesa; 
		this.forca = forca;
		this.velocidade = velocidade;
		this.alcance = alcance;
		this.itens = itens;
		this.jogador = jogador;
	}
	
	
	//Getters//
	
	public int getIdPersonagem() {
		return this.id_personagem;
	}
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
	public int getAlcance() {
		return this.alcance;
	}
	public List<Item> getItens (){
		return this.itens;
	}
	public Jogador getJogador() {
		return this.jogador;
	}
	
	//Getters//
}
