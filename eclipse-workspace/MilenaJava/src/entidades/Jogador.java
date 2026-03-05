package entidades;

public class Jogador {
	private String nickname;
	private String senha;
	
	public Jogador (String nickname, String senha) {
		this.nickname =  nickname;
		this.senha = senha;
	}
	
	
	
	//Getters//
	
	public String getNickname() {
		return this.nickname;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	//Getters//
}
