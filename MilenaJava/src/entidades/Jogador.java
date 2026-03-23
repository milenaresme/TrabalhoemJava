package entidades;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	private int id_jogador;
	private String nickname;
	private String senha;

	private List<Personagem> personagens;
	
	//Construtor para criar novo item//
	public Jogador (String nickname, String senha) {
		this.nickname =  nickname;
		this.senha = senha;
		this.personagens = new ArrayList<>();
	}
	
	//Construtor para carregar do banco//
	public Jogador (int id_jogador,String nickname, String senha) {
		this.id_jogador = id_jogador;
		this.nickname =  nickname;
		this.senha = senha;
		this.personagens = new ArrayList<>();
	}
	
	
	
	
	//Getters//
	
	public int getIdJogador() {
		return this.id_jogador;
	}
	public String getNickname() {
		return this.nickname;
	}
	public String getSenha() {
		return this.senha;
	}
	public List<Personagem> getPersonagens(){
		return this.personagens;
	}
	
	//Getters//
}
