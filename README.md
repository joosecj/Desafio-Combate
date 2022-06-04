<h1>DESAFIO: Combate</h1>

Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome, uma quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos, de modo que em cada turno, os dois campeões se atacam. Você deve fazer um programa para instanciar dois campeões, depois executar N turnos de combate, mostrando a cada turno o estado de cada campeão, conforme exemplos. Se em um turno um dos campeões morrer (quantidade de vida igual a zero), o combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE".
A regra para um campeão A receber dano de outro campeão B é a seguinte:

1) A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B, descontada a
  quantidade de armadura do campeão A. A quantidade de vida resultante não pode ser menor que zero.
2) Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve perder.
  Você deve criar uma classe para representar o campeão, conforme projeto abaixo.
3) O método takeDamage serve para fazer com que o campeão receba dano advindo do ataque de outro campeão,
  conforme regras acima. 
4) O método status deve retornar o nome e a situação de vida do campeão (inclusive com a palavra "morreu" se
  a vida estiver a zero), conforme exemplos.

##

![Exemplo Class, variaveis e metodo](https://i.imgur.com/kkEzK1y.png)

![Exempplo1](https://i.imgur.com/cfWb8vu.png)

![Exemplo2](https://i.imgur.com/UrCTnbe.png)



## Realização

[DevSuperior - Escola de programação](https://devsuperior.com.br/)

[![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/devsuperior.ig) ![DevSuperior no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)