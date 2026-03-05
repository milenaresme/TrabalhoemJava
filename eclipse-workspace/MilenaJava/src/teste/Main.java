package teste;
import entidades.Jogador;
import entidades.Item;
import entidades.Personagem;

public class Main {
	public static void main(String[]args) {
		String nickname = "Milena";
		String senha = "1234";
		
		Jogador jogador1 = new Jogador (nickname, senha);
		
		System.out.println(jogador1.getNickname());
	}
}
