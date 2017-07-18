package com.battleship.play.game;

import com.battleship.play.game.battleship.game.pojo.Cell;
import com.battleship.play.game.battleship.game.util.InputReaderUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		InputReaderUtil.executeByFilePath("resources/inputToGameBattle.txt");
	}

	public static void print(Cell[][] mat) {

		for (int i = 0; i < mat[0].length; i++) {

			for (int j = 0; j < mat.length; j++) {

				System.out.println(mat[i][j]);

			}
			System.out.println();
		}
	}

}
