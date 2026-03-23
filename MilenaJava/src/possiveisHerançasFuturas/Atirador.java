package possiveisHerançasFuturas;

import java.util.List;
import entidades.Personagem;
import entidades.Item;
import entidades.Jogador;

public class Atirador extends Personagem {
	private int municao;
	private int precisao;
	public Atirador (String nome,int vida, int defesa, int forca, int velocidade, int alcance, int municao, int precisao,List<Item> itens, Jogador jogador) {
		super (nome, vida, defesa, forca, velocidade, alcance, itens, jogador);
		this.municao = municao;
		this.precisao = precisao;

	}
	
	
	//Getters//
	
	public int getMunicao() {
		return this.municao;
	}
	public int getPrecisao() {
		return this.precisao;
	}
	
	//Getters//
}