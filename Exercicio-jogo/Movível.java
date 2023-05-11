
public interface Movível {
	
	
	default void andar(int x, int y) {
		int sorteio = (int) (Math.random()*4);
		if (sorteio == 0) y -= 1; // considerando um plano 2D sem movimentação em diagonais se movimenta para cima
		if (sorteio == 1) x += 1; // para a direita
		if (sorteio == 2) y += 1; // para baixo
		if (sorteio == 3) x -= 1; // para a esquerda
		
	}
	
}

