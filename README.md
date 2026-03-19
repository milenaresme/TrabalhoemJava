Jogo de Personagens e Itens

Este é um pequeno projeto em Java que simula jogadores, personagens e itens de um jogo. O objetivo é mostrar como cada jogador pode ter personagens e como cada personagem pode ter itens no seu inventário.

Estrutura do Projeto

O projeto tem quatro classes principais:

1. Item

Representa um item que um personagem pode usar.
Cada item possui:

Nome (String)

Tamanho (double)

Dano (int)

Exemplo: uma espada que causa 70 de dano.

2. Jogador

Representa uma pessoa que joga o jogo.
Cada jogador possui:

Nickname (String)

Senha (String)

Lista de personagens (List<Personagem>)

3. Personagem

Representa um personagem controlado pelo jogador.
Cada personagem possui:

Nome (String)

Vida, defesa, força, velocidade e alcance (int)

Lista de itens (List<Item>)

Referência ao jogador que controla o personagem

Exemplo: "Dartanham" é um personagem da Milena com 100 de vida e 50 de força.

4. Main

Classe principal que:

Cria jogadores, personagens e itens

Adiciona personagens ao jogador e itens ao inventário

Mostra todas as informações de cada jogador, personagem e itens no console

Como funciona

Criamos dois jogadores: Milena e Fulfaro.

Cada jogador recebe um personagem.

Criamos alguns itens, como "Pedra" e "Espada", e adicionamos ao inventário dos personagens.

Por fim, o programa imprime todas as informações no console, mostrando jogadores, personagens e seus itens com seus atributos.

Saída esperada no console:

==================================
Jogador:
Nome: Milena
Senha: 1234
==================================
Personagem: Dartanham
==================================
Inventário:
Dano: 30
Nome: Pedra
Tamanho: 0.8
==================================
Dano: 70
Nome: Espada
Tamanho: 1.4
==================================

Resumo

Este projeto demonstra conceitos básicos de programação orientada a objetos (POO):

Classes e objetos: Jogador, Personagem, Item

Listas de objetos: Cada jogador tem personagens, cada personagem tem itens

Relacionamento entre objetos: Personagem conhece seu jogador e seus itens
