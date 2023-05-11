
public abstract class Jogador {
	
	private String nome;
	private int xp = 5;
	private int hp = 100;
	private boolean envenenado = false;
	private int x;
	private int y;
	
	// ^ a melhor prática seria indicar o xp, hp e envenenado ali em cima pois ambos jogadores vão começar com as mesmas
	// condições
	// ATALHO PARA COPIAR LINHAS - CTRL + ALT + BAIXO
	// um atalho para gerar GETTERS AND SETTERS seria source > generate getters and setters
	// ou usando CTRL 3  e procurando GGAS por exemplo para atalhar
	// construtor padrão está gerado automaticamente acima ^
	
	public Jogador() {
	}
	// construtor que recebe o nome do jogador abaixo (sinal de + no slide quer dizer public, de - private)
	// você pode ter quantos métodos com o mesmo nome - isso se chama sobrecarga de métodos - desde que a assinatura seja diferente
	// exemplo: public Jogador (int xp) e public Jogador (int hp) < pois eles são iguais
	// uma alternativa seria public Jogador (int hp, int xp) 
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}
	
	public void receberDano(int pontos) {
		this.hp -= pontos;
		if(this.hp <= 0) {
			System.out.println("Game Over" + this.nome);
			this.hp = 0;		}
	}
	
	public void receberCura (int pontos) {
		this.hp += pontos;
	}
	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
	}
	
	public void receberAntidoto () {
		if(isEnvenenado()) {
			this.envenenado = false;
		}
		else {
			this.envenenado = true;
		}
	}
		// aqui poderiamos usar uma unica linha, sendo this.envenenado = !isEnvenenado(); 
		// o ! serve pra reverter o resultado
	
	public void atacar(Jogador jogador) {
		jogador.receberDano(this.getXp());
		if (jogador.getHp() == 0)
			this.ganharExperiencia(jogador.getXp());
	}
	
	
		}
	
