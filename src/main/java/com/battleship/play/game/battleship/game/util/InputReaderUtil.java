package com.battleship.play.game.battleship.game.util;

import com.battleship.play.game.battleship.game.pojo.Player;
import com.battleship.play.game.game.constant.BattleshipType;
import com.battleship.play.game.game.playground.BattleGround;

public class InputReaderUtil {

	public static void executeByFilePath(String filePath) {
		String[] str = FileUtil.readFileByLine(filePath);

		String[] size = str[0].split(" ");

		int y = Integer.parseInt(size[0]);
		char x = Character.toUpperCase(size[1].charAt(0));
		int numberOfShips = Integer.parseInt(str[1]);

		Player player1 = new Player();
		
		

		player1.setPlayerName("Player-1");
		player1.setNumberOfbattleShips(numberOfShips);
		player1.initBattlefield(x, y);

		Player player2 = new Player();

		player2.setPlayerName("Player-2");
		player2.setNumberOfbattleShips(numberOfShips);
		player2.initBattlefield(x, y);

		for (int i = 2; i < 2 + numberOfShips; i++) {
			String line = str[i];
			String[] position = line.split(" ");
			BattleshipType battleshipType = null;
			if (position[0].equalsIgnoreCase("Q")) {
				battleshipType = BattleshipType.Q_TYPE;
			} else if (position[0].equalsIgnoreCase("P")) {
				battleshipType = BattleshipType.P_TYPE;
			}

			int len = Integer.parseInt(position[1]);
			int wid = Integer.parseInt(position[2]);
			String player1BattleShipPos = position[3];
			String player2BattleShipPos = position[4];
			player1.fillBattleField(battleshipType, len, wid, player1BattleShipPos);
			player2.fillBattleField(battleshipType, len, wid, player2BattleShipPos);

		}

		String player1Moves[] = str[2 + numberOfShips].split(" ");
		String player2Moves[] = str[3 + numberOfShips].split(" ");

		BattleGround battleGround = new BattleGround();
		System.out.println(battleGround.playGame(player1Moves, player2Moves, player1, player2));
	}

}
