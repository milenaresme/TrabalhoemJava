CREATE TABLE item (
	id_item SERIAL PRIMARY KEY,
	nome varchar(50) NOT NULL,
	tamanho double (20) NOT NULL,
	dano int
)

CREATE TABLE personagem (
	id_personagem SERIAL PRIMARY KEY,
	nome varchar(50) NOT NULL,
	vida int,
	defesa int,
	forca int,
	velocidade int,
	alcance int,
	
	id_jogador int,
	FOREIGN KEY (id_jogador) REFERENCES jogador(id_jogador)
)

CREATE TABLE jogador (
	id_jogador SERIAL PRIMARY KEY,
	nickname varchar(50) NOT NULL,
	senha varchar(50) NOT NULL
)

CREATE TABLE inventario (
	id_item int,
	id_personagem int,

	PRIMARY KEY (id_item,id_personagem),
	
	FOREIGN KEY (id_item) REFERENCES item (id_item),
	FOREIGN KEY (id_personagem) REFERENCES personagem (id_personagem)
)