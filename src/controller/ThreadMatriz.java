package controller;

public class ThreadMatriz extends Thread {
	private int[] linha;

	public ThreadMatriz(int[] linha) {
		this.linha = linha;
	}
	
	public void run() {
		int soma = 0;
		int tid = (int)getId();
		for(int valor : linha) {
			soma += valor;
		}
		System.out.println("Thread " + tid + ": Soma = " + soma);
	}
}
