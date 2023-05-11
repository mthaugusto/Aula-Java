
public class Jogo {

	public static void main(String[] args) {
		
		Fase fase = new Fase();
        
        Guerreiro guerreiro = new Guerreiro();
        fase.carregar(guerreiro);
        
        Mago mago = new Mago();
        fase.carregar(mago);
        
        Dragao dragao = new Dragao(null);
        fase.carregar(dragao);
        
        BolaDeFogo bolaDeFogo = new BolaDeFogo(null);
        fase.carregar(bolaDeFogo);
    }
	}
//		var jogador1 = new Mago();
//		var jogador2 = new Guerreiro();
//		
//		
//		mostrarJogador(jogador1);
//		jogador1.receberDano(10);
//		mostrarJogador(jogador1);
//		jogador1.receberCura(5);
//		mostrarJogador(jogador1);
//		jogador1.ganharExperiencia(20);
//		mostrarJogador(jogador1);
//		jogador1.receberAntidoto();
//		mostrarJogador(jogador1);
//		jogador2.atacar(jogador1);
//		mostrarJogador(jogador1);
//		
//		System.out.println("Jogador 2 " + jogador2.getNome() + 
//							" XP=" + jogador2.getXp() +
//							" HP=" + jogador2.getHp() +
//							" Env=" + jogador2.isEnvenenado() 
//			);
//	}
//
//	private static void mostrarJogador(Jogador jogador1) {
//		System.out.println("Jogador 1 " + jogador1.getNome() + 
//							" XP=" + jogador1.getXp() +
//							" HP=" + jogador1.getHp() +
//							" Env=" + jogador1.isEnvenenado() 
//						);
//	}
//	

