package view;

import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {
		int mat[][] = new int [3][5];
		for(int y = 0; y < 3; y++) {
			for(int x = 0; x < 5; x++) {
				mat[y][x] = (int)(Math.random() * (99 + 1) + 1);
				
			}
		}
		for(int i = 0; i < 3; i++) {
			Thread threadMatriz = new ThreadMatriz(mat[i]);
			threadMatriz.start();
		}
	}

}
