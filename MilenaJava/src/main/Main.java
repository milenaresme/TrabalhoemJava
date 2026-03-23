package main;
import entidades.Jogador;
import entidades.Item;
import entidades.Personagem;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[]args) {
		List<Jogador>jogadores = new ArrayList<>();
		
		
		List<Item> inventarioMilena = new ArrayList<>();
		String nickname1 = "Milena";
		String senha1 = "1234";
		Jogador milena = new Jogador (
				nickname1, senha1
				);
		jogadores.add(milena);
		
		
		List<Item> inventarioFulfaro = new ArrayList<>();
		String nickname2 = "Fulfaro";
		String senha2 = "abcd";
		Jogador fulfaro = new Jogador (
				nickname2, senha2
				);
		jogadores.add(fulfaro);
		
		
		String nomePersonagem1 = "Dartanham";
		int vida1 = 100;
		int defesa1 = 100;
		int forca1 = 50;
		int velocidade1 = 30;
		int alcance1 = 20;
		Personagem personagem1 = new Personagem(
				nomePersonagem1, vida1, defesa1, forca1, velocidade1, alcance1,inventarioMilena,milena
				);
		milena.getPersonagens().add(personagem1);
		
		
		String nomePersonagem2 = "Guilherme";
		int vida2 = 150;
		int defesa2 = 60;
		int forca2 = 80;
		int velocidade2 = 50;
		int alcance2 = 10;
		Personagem personagem2 = new Personagem(
				nomePersonagem2, vida2, defesa2, forca2, velocidade2, alcance2, inventarioFulfaro, fulfaro
				);
		fulfaro.getPersonagens().add(personagem2);
		
		
		String nomeItem = "Pedra";
		double tamanho = 0.80;
		int dano = 30;
		String nomeItem2 = "Espada";
		double tamanho2 = 1.40;
		int dano2 = 70;
		
		Item Pedra =new Item (nomeItem, tamanho, dano);
		inventarioMilena.add(Pedra);
		Item Espada = new Item(nomeItem2,tamanho2,dano2);
		inventarioMilena.add(Espada);
		inventarioFulfaro.add(Espada);
		
		for (Jogador j:jogadores) {
			System.out.println("==================================");
			System.out.println("Jogador:");
			System.out.println("Nome:"+j.getNickname());
			System.out.println("Senha:"+j.getSenha());
			System.out.println("==================================");
			for (Personagem p :j.getPersonagens()) {
				System.out.println("Personagem:"+p.getNome());
				System.out.println("==================================");
				System.out.println("Inventário:");
				for (Item i : p.getItens()) {
					System.out.println("Dano:"+i.getDano());
					System.out.println("Nome:"+i.getNome());
					System.out.println("Tamanho:"+i.getTamanho());
					System.out.println("==================================");
				}
			}
		}
	}
}