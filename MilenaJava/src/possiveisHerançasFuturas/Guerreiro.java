package possiveisHerançasFuturas;

import entidades.Personagem;
import entidades.Jogador;
import entidades.Item;
import java.util.List;



public class Guerreiro extends Personagem {
	private int critico;
	public Guerreiro (String nome, int vida, int defesa, int forca, int velocidade, int critico, int alcance, List<Item> Itens,Jogador jogador) {
		super (nome, vida, defesa, forca, velocidade, alcance,Itens,jogador);
		this.critico = critico; 
	}
	
	//Getters//
	
	public int getCritico () {
		return this.critico;
	}
	
	//Getters//
}
