package com.battleship.play.game.battleship.game.util;

public class GameBattleUtil {

	public static int getRealIndexValue(char index) {

		return ((int) Character.toUpperCase(index) - 65) ;

	}

}
