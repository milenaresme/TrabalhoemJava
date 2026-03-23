package possiveisHerançasFuturas;

import entidades.Item;
import entidades.Personagem;
import entidades.Jogador;
import java.util.List;


public class Mago extends Personagem {
	private int mana;
	public Mago (String nome,int vida,int defesa,int forca,int velocidade,int alcance, int mana, List<Item>Itens, Jogador jogador) {
		super(nome,vida,defesa,forca,velocidade,alcance, Itens,jogador);
		this.mana = mana;
	}
	
	//Getters//
	
	public int getMana() {
		return this.mana;
	}
	
	//Getters//

}

